package com.para.todos.Produtos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.para.todos.Produtos.Model.Produtos;

@Repository
public interface RepositoryP extends JpaRepository<Produtos,Integer> {

}
