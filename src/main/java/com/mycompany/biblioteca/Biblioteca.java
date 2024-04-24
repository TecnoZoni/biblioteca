package com.mycompany.biblioteca;

import com.mycompany.biblioteca.igu.Login;
import com.mycompany.biblioteca.persistencia.ControladoraPersistencia;

public class Biblioteca {

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
    }
}
