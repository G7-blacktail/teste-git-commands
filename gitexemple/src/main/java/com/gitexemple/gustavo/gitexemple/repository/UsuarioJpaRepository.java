package com.gitexemple.gustavo.gitexemple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitexemple.gustavo.gitexemple.jpa.entity.Usuario;

@Repository
public interface UsuarioJpaRepository extends JpaRepository <Usuario, String>{

}
