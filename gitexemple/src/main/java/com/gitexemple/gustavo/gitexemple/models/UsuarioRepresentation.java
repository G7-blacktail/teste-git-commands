package com.gitexemple.gustavo.gitexemple.models;

public class UsuarioRepresentation {
    
    private String idUsuario;

    private String nome;

    private Integer idade;

    public String getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(final String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(final Integer idade) {
        this.idade = idade;
    }
}
