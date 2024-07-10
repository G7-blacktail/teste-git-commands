package com.gitexemple.gustavo.gitexemple.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @Column(name = "id_produto")
    private String idProduto;

    @Column(name = "nm_produto")
    private String nome;

    public String getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(final String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

}
