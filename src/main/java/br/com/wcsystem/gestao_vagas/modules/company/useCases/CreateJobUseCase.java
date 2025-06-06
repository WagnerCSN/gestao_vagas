package br.com.wcsystem.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.wcsystem.gestao_vagas.modules.company.entities.JobEntity;
import br.com.wcsystem.gestao_vagas.modules.company.repositories.JobRepository;
import jakarta.validation.Valid;

@Service
public class CreateJobUseCase {
    
    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(@Valid @RequestBody JobEntity jobEntity){
        return this.jobRepository.save(jobEntity);
    }
}
