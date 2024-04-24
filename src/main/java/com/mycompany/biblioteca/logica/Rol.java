package com.mycompany.biblioteca.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_rol;
    @Basic
    private String nombre_rol;
    @OneToMany(mappedBy = "unRol")
    private List<Usuario> listaUsuarios;

    public Rol() {
    }

    public Rol(int id_rol, String nombre_rol, List<Usuario> listaUsuarios) {
        this.id_rol = id_rol;
        this.nombre_rol = nombre_rol;
        this.listaUsuarios = listaUsuarios;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
