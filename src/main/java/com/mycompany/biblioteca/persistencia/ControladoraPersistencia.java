package com.mycompany.biblioteca.persistencia;

import com.mycompany.biblioteca.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    UsuarioJpaController userJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return userJpa.findUsuarioEntities();
    }

    
    
}
