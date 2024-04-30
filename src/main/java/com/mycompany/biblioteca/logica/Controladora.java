package com.mycompany.biblioteca.logica;

import com.mycompany.biblioteca.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

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

}
