package com.mycompany.biblioteca.persistencia;

import com.mycompany.biblioteca.logica.Rol;
import com.mycompany.biblioteca.logica.Usuario;
import com.mycompany.biblioteca.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    UsuarioJpaController userJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return userJpa.findUsuarioEntities();
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario user) {
        userJpa.create(user);
    }

    public void borrarUsuario(int dni) {
        try {
            userJpa.destroy(dni);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int dni) {
        return userJpa.findUsuario(dni);
    }

    public void editarUsuario(Usuario usu) {
        try {
            userJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
