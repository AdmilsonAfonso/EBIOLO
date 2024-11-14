package com.para.todos.Produtos.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.para.todos.Produtos.Model.Produtos;
import com.para.todos.Produtos.Servicw.ServiceP;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
@RequestMapping("/produtos")
public class ControllP {

    @Autowired
    private ServiceP serviceP;

    public ControllP(ServiceP serviceP) {
        this.serviceP = serviceP;
    }

    @PostMapping("/salvaP")
    public String salvarP(@RequestBody Produtos produtos) {
         serviceP.salvarP(produtos);
         return "";
    }
    
    @GetMapping("/bucarP")
    public List<Produtos> buscarP() {
        return serviceP.buscarP();
    }

    @GetMapping("/buscarId/{id}")
    public Produtos buscaId(@PathVariable Integer id) {
        return serviceP.buscarEmail(id);
    }

    @GetMapping("/apagarId/{id}")
    public String apagarId(@PathVariable Integer id) {
        serviceP.apagarId(id);
        return "produto eliminado ";
    }

    @PostMapping("/updateP/{id}")
    public String updateP(@PathVariable Integer id,Produtos produtos) {
        
        Produtos produtosExistent = serviceP.buscarEmail(id);
        produtosExistent.setId(produtos.getId());
        produtosExistent.setNomep(produtos.getNomep());
        produtosExistent.setImg(produtos.getImg());
        produtosExistent.setDescricao(produtos.getDescricao());
        produtosExistent.setPreco(produtos.getPreco());
        produtosExistent.setEstado(produtos.getEstado());
        produtosExistent.setEmail(produtos.getEmail());
        
        serviceP.salvarP(produtosExistent);
        return "produto editado";
    }
    
    
    


    
    
}
