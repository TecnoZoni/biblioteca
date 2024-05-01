package com.mycompany.biblioteca.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int isbn;

    @Basic
    private String titulo;
    private int cantidad;

    @Temporal(TemporalType.DATE)
    private Date anio_publicacion;

    @ManyToMany
    @JoinTable(
            name = "libro_autor"
    )
    private List<Autor> autores;

    @ManyToMany
    @JoinTable(
            name = "libro_editorial"
    )
    private List<Editorial> editoriales;

    @ManyToMany
    @JoinTable(
            name = "libro_genero"
    )
    private List<Genero> generos;

    public Libro() {
    }

    public Libro(int isbn, String titulo, int cantidad, Date anio_publicacion, List<Autor> autores, List<Editorial> editoriales, List<Genero> generos) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.anio_publicacion = anio_publicacion;
        this.autores = autores;
        this.editoriales = editoriales;
        this.generos = generos;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(Date anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(List<Editorial> editoriales) {
        this.editoriales = editoriales;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }
    
    

}
