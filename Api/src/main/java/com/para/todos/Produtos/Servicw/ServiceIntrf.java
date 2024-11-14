package com.para.todos.Produtos.Servicw;

import java.util.List;

import com.para.todos.Produtos.Model.Produtos;

public interface ServiceIntrf {
    Produtos salvarP(Produtos produtos);
    List<Produtos> buscarP();
    public Produtos buscarEmail(int id);
    void apagarId(int id);
    Produtos updateP(Produtos produtos);
}
