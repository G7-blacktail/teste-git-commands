package com.gitexemple.gustavo.gitexemple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gitexemple.gustavo.gitexemple.jpa.entity.Usuario;

public interface UsuarioJpaRepository extends JpaRepository <Usuario, String>{

}
