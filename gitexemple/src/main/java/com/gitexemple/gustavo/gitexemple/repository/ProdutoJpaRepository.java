package com.gitexemple.gustavo.gitexemple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitexemple.gustavo.gitexemple.jpa.entity.Produto;

@Repository
public interface ProdutoJpaRepository extends JpaRepository<Produto, String>{
    
}
