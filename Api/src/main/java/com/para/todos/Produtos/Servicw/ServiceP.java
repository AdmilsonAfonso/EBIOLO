package com.para.todos.Produtos.Servicw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.para.todos.Produtos.Model.Produtos;
import com.para.todos.Produtos.Repository.RepositoryP;

@Service
public class ServiceP  implements ServiceIntrf{

    @Autowired
    private RepositoryP RepositoryP;

    @Override
    public Produtos salvarP(Produtos produtos) { 
       return RepositoryP.save(produtos);
    }

    @Override
    public List<Produtos> buscarP() {
        return RepositoryP.findAll();
        
    }

    @Override
    public Produtos buscarEmail(int id) {
        return RepositoryP.findById(id).get();
    }

    @Override
    public void apagarId(int id) {
        RepositoryP.deleteById(id);    
    }

    @Override
    public Produtos updateP(Produtos produtos) {
        return RepositoryP.save(produtos);
    }
    
}
