package com.para.todos.Vendedores.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.para.todos.Vendedores.Model.Usuario;
import com.para.todos.Vendedores.Repository.RepositoryU;

@Service
public class ServiceU  implements ServiceIntrf{

    @Autowired
    private RepositoryU repositoryU;

    public ServiceU(RepositoryU repositoryU) {
        this.repositoryU = repositoryU;
    }

    @Override
    public Usuario salavUsuario(ServiceDTO serviceDTO) {
            Usuario user = new Usuario(serviceDTO.getNome(),serviceDTO.getEmail(),serviceDTO.getPassWord(),serviceDTO.getFacebook(),serviceDTO.getWhatsp(),serviceDTO.getCategoria());
            return repositoryU.save(user);
          }

    @Override
    public List<Usuario> BuscarUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'BuscarUsuario'");
    }

    @Override
    public Usuario BuscarUsuarioEimal(String Eimal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'BuscarUsuarioEimal'");
    }

    @Override
    public Void apagarUsuario(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'apagarUsuario'");
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUsuario'");
    }
    
}
