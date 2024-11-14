package com.para.todos.Vendedores.Service;

import java.util.List;

import com.para.todos.Vendedores.Model.Usuario;

public interface ServiceIntrf {
    Usuario salavUsuario (ServiceDTO serviceDTO);
    List<Usuario> BuscarUsuario();
    public Usuario BuscarUsuarioEimal(String Eimal);
    Void apagarUsuario(int id);
    Usuario updateUsuario(Usuario usuario);

}
