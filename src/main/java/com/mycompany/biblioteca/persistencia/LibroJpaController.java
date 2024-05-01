package com.mycompany.biblioteca.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.biblioteca.logica.Autor;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.biblioteca.logica.Editorial;
import com.mycompany.biblioteca.logica.Genero;
import com.mycompany.biblioteca.logica.Libro;
import com.mycompany.biblioteca.persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LibroJpaController implements Serializable {

    public LibroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public LibroJpaController() {
        emf = Persistence.createEntityManagerFactory("bibliotecaPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Libro libro) {
        if (libro.getAutores() == null) {
            libro.setAutores(new ArrayList<Autor>());
        }
        if (libro.getEditoriales() == null) {
            libro.setEditoriales(new ArrayList<Editorial>());
        }
        if (libro.getGeneros() == null) {
            libro.setGeneros(new ArrayList<Genero>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Autor> attachedAutores = new ArrayList<Autor>();
            for (Autor autoresAutorToAttach : libro.getAutores()) {
                autoresAutorToAttach = em.getReference(autoresAutorToAttach.getClass(), autoresAutorToAttach.getId_autor());
                attachedAutores.add(autoresAutorToAttach);
            }
            libro.setAutores(attachedAutores);
            List<Editorial> attachedEditoriales = new ArrayList<Editorial>();
            for (Editorial editorialesEditorialToAttach : libro.getEditoriales()) {
                editorialesEditorialToAttach = em.getReference(editorialesEditorialToAttach.getClass(), editorialesEditorialToAttach.getId_editorial());
                attachedEditoriales.add(editorialesEditorialToAttach);
            }
            libro.setEditoriales(attachedEditoriales);
            List<Genero> attachedGeneros = new ArrayList<Genero>();
            for (Genero generosGeneroToAttach : libro.getGeneros()) {
                generosGeneroToAttach = em.getReference(generosGeneroToAttach.getClass(), generosGeneroToAttach.getId_genero());
                attachedGeneros.add(generosGeneroToAttach);
            }
            libro.setGeneros(attachedGeneros);
            em.persist(libro);
            for (Autor autoresAutor : libro.getAutores()) {
                autoresAutor.getLibros().add(libro);
                autoresAutor = em.merge(autoresAutor);
            }
            for (Editorial editorialesEditorial : libro.getEditoriales()) {
                editorialesEditorial.getLibros().add(libro);
                editorialesEditorial = em.merge(editorialesEditorial);
            }
            for (Genero generosGenero : libro.getGeneros()) {
                generosGenero.getLibros().add(libro);
                generosGenero = em.merge(generosGenero);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Libro libro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Libro persistentLibro = em.find(Libro.class, libro.getIsbn());
            List<Autor> autoresOld = persistentLibro.getAutores();
            List<Autor> autoresNew = libro.getAutores();
            List<Editorial> editorialesOld = persistentLibro.getEditoriales();
            List<Editorial> editorialesNew = libro.getEditoriales();
            List<Genero> generosOld = persistentLibro.getGeneros();
            List<Genero> generosNew = libro.getGeneros();
            List<Autor> attachedAutoresNew = new ArrayList<Autor>();
            for (Autor autoresNewAutorToAttach : autoresNew) {
                autoresNewAutorToAttach = em.getReference(autoresNewAutorToAttach.getClass(), autoresNewAutorToAttach.getId_autor());
                attachedAutoresNew.add(autoresNewAutorToAttach);
            }
            autoresNew = attachedAutoresNew;
            libro.setAutores(autoresNew);
            List<Editorial> attachedEditorialesNew = new ArrayList<Editorial>();
            for (Editorial editorialesNewEditorialToAttach : editorialesNew) {
                editorialesNewEditorialToAttach = em.getReference(editorialesNewEditorialToAttach.getClass(), editorialesNewEditorialToAttach.getId_editorial());
                attachedEditorialesNew.add(editorialesNewEditorialToAttach);
            }
            editorialesNew = attachedEditorialesNew;
            libro.setEditoriales(editorialesNew);
            List<Genero> attachedGenerosNew = new ArrayList<Genero>();
            for (Genero generosNewGeneroToAttach : generosNew) {
                generosNewGeneroToAttach = em.getReference(generosNewGeneroToAttach.getClass(), generosNewGeneroToAttach.getId_genero());
                attachedGenerosNew.add(generosNewGeneroToAttach);
            }
            generosNew = attachedGenerosNew;
            libro.setGeneros(generosNew);
            libro = em.merge(libro);
            for (Autor autoresOldAutor : autoresOld) {
                if (!autoresNew.contains(autoresOldAutor)) {
                    autoresOldAutor.getLibros().remove(libro);
                    autoresOldAutor = em.merge(autoresOldAutor);
                }
            }
            for (Autor autoresNewAutor : autoresNew) {
                if (!autoresOld.contains(autoresNewAutor)) {
                    autoresNewAutor.getLibros().add(libro);
                    autoresNewAutor = em.merge(autoresNewAutor);
                }
            }
            for (Editorial editorialesOldEditorial : editorialesOld) {
                if (!editorialesNew.contains(editorialesOldEditorial)) {
                    editorialesOldEditorial.getLibros().remove(libro);
                    editorialesOldEditorial = em.merge(editorialesOldEditorial);
                }
            }
            for (Editorial editorialesNewEditorial : editorialesNew) {
                if (!editorialesOld.contains(editorialesNewEditorial)) {
                    editorialesNewEditorial.getLibros().add(libro);
                    editorialesNewEditorial = em.merge(editorialesNewEditorial);
                }
            }
            for (Genero generosOldGenero : generosOld) {
                if (!generosNew.contains(generosOldGenero)) {
                    generosOldGenero.getLibros().remove(libro);
                    generosOldGenero = em.merge(generosOldGenero);
                }
            }
            for (Genero generosNewGenero : generosNew) {
                if (!generosOld.contains(generosNewGenero)) {
                    generosNewGenero.getLibros().add(libro);
                    generosNewGenero = em.merge(generosNewGenero);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = libro.getIsbn();
                if (findLibro(id) == null) {
                    throw new NonexistentEntityException("The libro with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Libro libro;
            try {
                libro = em.getReference(Libro.class, id);
                libro.getIsbn();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The libro with id " + id + " no longer exists.", enfe);
            }
            List<Autor> autores = libro.getAutores();
            for (Autor autoresAutor : autores) {
                autoresAutor.getLibros().remove(libro);
                autoresAutor = em.merge(autoresAutor);
            }
            List<Editorial> editoriales = libro.getEditoriales();
            for (Editorial editorialesEditorial : editoriales) {
                editorialesEditorial.getLibros().remove(libro);
                editorialesEditorial = em.merge(editorialesEditorial);
            }
            List<Genero> generos = libro.getGeneros();
            for (Genero generosGenero : generos) {
                generosGenero.getLibros().remove(libro);
                generosGenero = em.merge(generosGenero);
            }
            em.remove(libro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Libro> findLibroEntities() {
        return findLibroEntities(true, -1, -1);
    }

    public List<Libro> findLibroEntities(int maxResults, int firstResult) {
        return findLibroEntities(false, maxResults, firstResult);
    }

    private List<Libro> findLibroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Libro.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Libro findLibro(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Libro.class, id);
        } finally {
            em.close();
        }
    }

    public int getLibroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Libro> rt = cq.from(Libro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
