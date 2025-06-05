package main.java.model;

import java.time.LocalDate;
import java.util.List;

public class Autor {
    private String nome;
    private String sobrenome;
    private String nacionaliade;
    private LocalDate dataNascimento;
    private List<String> generosLiterarios;
    
    public Autor(String nome 
    // String sobrenome, String nacionaliade, LocalDate dataNascimento,
    // List<String> generosLiterarios
    ) {
        this.nome = nome;
        // this.sobrenome = sobrenome;
        // this.nacionaliade = nacionaliade;
        // this.dataNascimento = dataNascimento;
        // this.generosLiterarios = generosLiterarios;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNacionaliade() {
        return nacionaliade;
    }

    public void setNacionaliade(String nacionaliade) {
        this.nacionaliade = nacionaliade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<String> getGenerosLiterarios() {
        return generosLiterarios;
    }

    public void setGenerosLiterarios(List<String> generosLiterarios) {
        this.generosLiterarios = generosLiterarios;
    }

}
