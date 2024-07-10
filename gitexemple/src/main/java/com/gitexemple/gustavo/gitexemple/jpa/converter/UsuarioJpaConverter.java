package com.gitexemple.gustavo.gitexemple.jpa.converter;

import com.gitexemple.gustavo.gitexemple.converter.AbstractConverter;
import com.gitexemple.gustavo.gitexemple.jpa.entity.Usuario;
import com.gitexemple.gustavo.gitexemple.models.UsuarioRepresentation;

public class UsuarioJpaConverter extends AbstractConverter<Usuario, UsuarioRepresentation>{

    public UsuarioJpaConverter(){
        super();
    }

    @Override
    public UsuarioRepresentation convert(Usuario obj) {
        if(obj == null){
            return null;
        }

        UsuarioRepresentation rep = new UsuarioRepresentation();
        rep.setIdUsuario(obj.getIdUsuario());
        rep.setNome(obj.getNome());
        rep.setIdade(obj.getIdade());

        return rep;
    }

    @Override
    public Usuario convertBack(UsuarioRepresentation rep) {
        if(rep == null) return null;

        Usuario obj = new Usuario();

        obj.setIdUSuario(rep.getIdUsuario());
        obj.setNome(rep.getNome());
        obj.setIdade(rep.getIdade());

        return obj;
    }

}
