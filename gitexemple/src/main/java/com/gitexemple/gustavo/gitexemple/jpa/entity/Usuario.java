package com.gitexemple.gustavo.gitexemple.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @Column(name = "id_usuario")
    private String idUsuario;

    @Column(name = "nm_usuario")
    private String nome;

    @Column(name = "nr_idade")
    private Integer idade;

    public String getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUSuario(final String idUsuario){
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

    public void setIdade(final Integer idade){
        this.idade = idade;
    }
}
