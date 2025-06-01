package br.com.wcsystem.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    
    public UserFoundException(){
        super("Candidate already exists!");
    }
}
