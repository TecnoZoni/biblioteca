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

}
