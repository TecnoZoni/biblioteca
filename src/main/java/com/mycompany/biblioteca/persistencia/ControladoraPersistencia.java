package com.mycompany.biblioteca.persistencia;

import com.mycompany.biblioteca.logica.Autor;
import com.mycompany.biblioteca.logica.Editorial;
import com.mycompany.biblioteca.logica.Genero;
import com.mycompany.biblioteca.logica.Rol;
import com.mycompany.biblioteca.logica.Usuario;
import com.mycompany.biblioteca.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    //USUARIOS Y ROLES
    UsuarioJpaController userJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    //GENERO, EDITORIAL Y AUTOR
    GeneroJpaController generoJpa = new GeneroJpaController();
    EditorialJpaController editorialJpa = new EditorialJpaController();
    AutorJpaController autorJpa = new AutorJpaController();

    //USUARIOS Y ROLES
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

    //GENERO, EDITORIAL Y AUTOR
    public List<Genero> traerGeneros() {
        List<Genero> listaGeneros = generoJpa.findGeneroEntities();
        return listaGeneros;
    }

    public List<Autor> traerAutores() {
        List<Autor> listaAutores = autorJpa.findAutorEntities();
        return listaAutores;
    }

    public List<Editorial> traerEditoriales() {
        List<Editorial> listaEditorial = editorialJpa.findEditorialEntities();
        return listaEditorial;
    }

    public void crearAutor(Autor aut) {
        autorJpa.create(aut);
    }

    public void crearEditorial(Editorial edit) {
        editorialJpa.create(edit);
    }

    public void crearGenero(Genero gen) {
        generoJpa.create(gen);
    }

    public void eliminarAutor(int id_autor) {
        try {
            autorJpa.destroy(id_autor);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEditorial(int id_editorial) {
        try {
            editorialJpa.destroy(id_editorial);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarGenero(int id_genero) {
        try {
            generoJpa.destroy(id_genero);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Autor traerAutor(int id) {
        return autorJpa.findAutor(id);
    }

    public Genero traerGenero(int id) {
        return generoJpa.findGenero(id);
    }

    public Editorial traerEditorial(int id) {
        return editorialJpa.findEditorial(id);
    }

    public void editarAutor(Autor aut) {
        try {
            autorJpa.edit(aut);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEditor(Editorial edit) {
        try {
            editorialJpa.edit(edit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarGenero(Genero gen) {
        try {
            generoJpa.edit(gen);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
