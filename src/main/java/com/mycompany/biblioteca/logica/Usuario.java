package com.mycompany.biblioteca.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer dni;
    @Basic
    private String nombre;
    private String apellido;
    private String contrasenia;
    private String telefono;
    private String email;
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "fk_rol")
    private Rol unRol;

    public Usuario() {
    }

    public Usuario(Integer dni, String nombre, String apellido, String contrasenia, String telefono, String email, String direccion, Rol unrol) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.unRol = unrol;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Rol getUnrol() {
        return unRol;
    }

    public void setUnrol(Rol unrol) {
        this.unRol = unrol;
    }

}
