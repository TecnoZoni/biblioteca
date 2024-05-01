package com.mycompany.biblioteca.logica;

import com.mycompany.biblioteca.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

//USUARIOS Y ROLES
    public Usuario comprobarUsuario(int dni, String contrasenia) {

        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

        Usuario user = null;

        for (Usuario users : listaUsuarios) {
            if (users.getDni() == (dni)) {
                if (users.getContrasenia().equals(contrasenia)) {
                    user = users;
                    return user;
                } else {
                    user = null;
                    return user;
                }
            }
        }
        return user;

    }

    public List<Usuario> traerUsuarios() {
        List<Usuario> ListaUsuarios = controlPersis.traerUsuarios();
        return ListaUsuarios;
    }

    public List<Rol> traerRoles() {
        List<Rol> listaRoles = controlPersis.traerRoles();
        return listaRoles;
    }

    public void crearUsuario(String dni, String nombre, String apellido, String direccion, String email, String telefono, String rolRecibido, String contraseña) {
        Usuario user = new Usuario();

        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setDireccion(direccion);
        user.setEmail(email);
        user.setTelefono(telefono);
        user.setContrasenia(contraseña);

        Rol rolEncotrado = new Rol();
        rolEncotrado = this.traerRol(rolRecibido);
        if (rolEncotrado != null) {
            user.setUnrol(rolEncotrado);
        }

        controlPersis.crearUsuario(user);

    }

    private Rol traerRol(String rolRecibido) {
        List<Rol> listaRoles = controlPersis.traerRoles();
        for (Rol rol : listaRoles) {
            if (rol.getNombre_rol().equals(rolRecibido)) {
                return rol;
            }
        }
        return null;
    }

    public void borrarUsuario(int dni) {
        controlPersis.borrarUsuario(dni);
    }

    public Usuario traerUsuario(int dni) {
        return controlPersis.traerUsuario(dni);
    }

    public void ediarUsuario(Usuario usu, String nombre, String apellido, String direccion, String email, String telefono, String rolRecibido, String contraseña) {

        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setDireccion(direccion);
        usu.setEmail(email);
        usu.setTelefono(telefono);
        usu.setContrasenia(contraseña);

        Rol rolEncotrado = new Rol();
        rolEncotrado = this.traerRol(rolRecibido);
        if (rolEncotrado != null) {
            usu.setUnrol(rolEncotrado);
        }

        controlPersis.editarUsuario(usu);

    }

    //GENERO, EDITORIAL Y AUTOR
    public List<Genero> traerGeneros() {
        List<Genero> listaGeneros = controlPersis.traerGeneros();
        return listaGeneros;
    }

    public List<Autor> traerAutores() {
        List<Autor> listaAutores = controlPersis.traerAutores();
        return listaAutores;
    }

    public List<Editorial> traerEditoriales() {
        List<Editorial> listaEditorial = controlPersis.traerEditoriales();
        return listaEditorial;
    }

    public void crearAutor(String nombreAutor, String apellidoAutor) {
        Autor aut = new Autor();

        aut.setNombre(nombreAutor);
        aut.setApellido(apellidoAutor);

        controlPersis.crearAutor(aut);

    }

    public void crearEditorial(String nombreEditorial) {
        Editorial edit = new Editorial();

        edit.setNombre(nombreEditorial);

        controlPersis.crearEditorial(edit);
    }

    public void crearGenero(String nombreGenero) {
        Genero gen = new Genero();

        gen.setNombre(nombreGenero);

        controlPersis.crearGenero(gen);
    }

    public void eliminarAutor(int id_autor) {
        controlPersis.eliminarAutor(id_autor);
    }

    public void eliminarEditorial(int id_editorial) {
        controlPersis.eliminarEditorial(id_editorial);
    }

    public void eliminarGenero(int id_genero) {
        controlPersis.eliminarGenero(id_genero);
    }

    public Autor traerAutor(int id) {
        return controlPersis.traerAutor(id);
    }

    public Genero traerGenero(int id) {
        return controlPersis.traerGenero(id);
    }

    public Editorial traerEditorial(int id) {
        return controlPersis.traerEditorial(id);
    }

    public void editarAutor(Autor aut, String nombre, String apellido) {
        aut.setNombre(nombre);
        aut.setApellido(apellido);
        controlPersis.editarAutor(aut);
    }

    public void editarEditorial(Editorial edit, String nombre) {
        edit.setNombre(nombre);
        controlPersis.editarEditor(edit);
    }

    public void editarGenero(Genero gen, String nombre) {
        gen.setNombre(nombre);
        controlPersis.editarGenero(gen);
    }

}
