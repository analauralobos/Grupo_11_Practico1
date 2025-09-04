package ar.edu.unlpam.ing.practico1.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class LibroDAO {

    private final List<Libro> libros = new ArrayList<>();
    private int nextId = 1;

    @PostConstruct
    public void init() {
        add(new Libro(0, "Cien años de soledad", "Gabriel García Márquez", 1967));
        add(new Libro(0, "El Principito", "Antoine de Saint-Exupéry", 1943));
    }

    public List<Libro> getAll() {
        return libros;
    }

    public Optional<Libro> getById(int id) {
        return libros.stream().filter(l -> l.getId() == id).findFirst();
    }

    public Libro add(Libro libro) {
        libro.setId(nextId++);
        libros.add(libro);
        return libro;
    }

    public boolean delete(int id) {
        return libros.removeIf(l -> l.getId() == id);
    }
}