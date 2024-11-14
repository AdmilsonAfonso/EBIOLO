package com.para.todos.Vendedores.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.para.todos.Vendedores.Model.Usuario;

@Repository
public interface RepositoryU extends JpaRepository<Usuario,Integer> {
    
}
