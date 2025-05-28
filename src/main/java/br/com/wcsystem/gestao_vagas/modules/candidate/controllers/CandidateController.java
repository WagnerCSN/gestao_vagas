package br.com.wcsystem.gestao_vagas.modules.candidate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wcsystem.gestao_vagas.modules.candidate.CandidateEntity;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    
    @Autowired
    private CandidateEntity candidateRepository;

    @PostMapping("/")
    public CandidateEntity create(@RequestBody CandidateEntity candidateEntity){
        return this.candidateRepository.save(candidateEntity);
    }
}
