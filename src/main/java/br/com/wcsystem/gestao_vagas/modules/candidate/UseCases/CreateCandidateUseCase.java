package br.com.wcsystem.gestao_vagas.modules.candidate.UseCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.wcsystem.gestao_vagas.exceptions.UserFoundException;
import br.com.wcsystem.gestao_vagas.modules.candidate.entities.CandidateEntity;
import br.com.wcsystem.gestao_vagas.modules.candidate.repositories.CandidateRepository;

@Service
public class CreateCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity){
     this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent((user) -> {
            throw new UserFoundException();
        });
        return this.candidateRepository.save(candidateEntity);
    }
}
