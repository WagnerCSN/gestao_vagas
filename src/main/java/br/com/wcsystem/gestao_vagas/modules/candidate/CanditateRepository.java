package br.com.wcsystem.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CanditateRepository extends JpaRepository<CandidateEntity, UUID>{
    
}
