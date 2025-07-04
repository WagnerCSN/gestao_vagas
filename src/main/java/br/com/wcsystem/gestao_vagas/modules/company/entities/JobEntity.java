package br.com.wcsystem.gestao_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name = "job")
@Data
public class JobEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;
    private String benefits;
    private String level;

    @ManyToOne
    @JoinColumn(name = "company_Id")
    private CompanyEntity companyEntity;
    
    @Column(name= "company_Id", insertable=false, updatable=false, nullable = false)
    private UUID companyID;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
