package br.com.wcsystem.gestao_vagas.modules.candidate;

import java.util.UUID;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CandidateEntity {
    private UUID id;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;
    public CandidateEntity save(CandidateEntity candidateEntity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
