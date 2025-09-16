package ar.edu.unlpam.ing.practico1.Ejercicio5;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LibroRepository {
    private final List<Libro> libros = new ArrayList<>();
    private Long currentId = 1L;

    public Libro save(Libro libro) {
        libro.setId(currentId++);
        libros.add(libro);
        return libro;
    }

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(l -> l.getId().equals(id)).findFirst();
    }

    public boolean deleteById(Long id) {
        return libros.removeIf(l -> l.getId().equals(id));
    }
}

