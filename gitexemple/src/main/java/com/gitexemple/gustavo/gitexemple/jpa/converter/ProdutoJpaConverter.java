package com.gitexemple.gustavo.gitexemple.jpa.converter;

import com.gitexemple.gustavo.gitexemple.converter.AbstractConverter;
import com.gitexemple.gustavo.gitexemple.jpa.entity.Produto;
import com.gitexemple.gustavo.gitexemple.models.ProdutoRepresentation;

public class ProdutoJpaConverter extends AbstractConverter<Produto, ProdutoRepresentation>{

    @Override
    public ProdutoRepresentation convert(Produto obj) {
        if(obj == null) return null;
        ProdutoRepresentation rep = new ProdutoRepresentation();
        rep.setIdProduto(obj.getIdProduto());
        rep.setNome(obj.getNome());
        return rep;
    }

    @Override
    public Produto convertBack(ProdutoRepresentation rep) {
        if(rep == null) return null;
        Produto obj = new Produto();
        obj.setIdProduto(rep.getIdProduto());
        obj.setNome(rep.getNome());
        return obj;
    }

}
