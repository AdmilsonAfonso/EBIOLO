package com.para.todos.Vendedores.Controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.para.todos.Vendedores.Service.ServiceDTO;
import com.para.todos.Vendedores.Service.ServiceU;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuario")
public class control {

    @Autowired
    private ServiceU serviceU;

    public control(ServiceU serviceU) {
        this.serviceU = serviceU;
    }
    
    @PostMapping("/salvar")
    public String salvar(@RequestBody ServiceDTO usuario) {
        serviceU.salavUsuario(usuario);
        return "";
    }
    
    
}
