package ar.edu.unlpam.ing.practico1.Ejercicio5;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    private final LibroRepository repository;

    public LibroService(LibroRepository repository) {
        this.repository = repository;
    }

    public Libro agregarLibro(Libro libro) {
        return repository.save(libro);
    }

    public List<Libro> obtenerLibros() {
        return repository.findAll();
    }

    public Optional<Libro> obtenerLibroPorId(Long id) {
        return repository.findById(id);
    }

    public boolean eliminarLibro(Long id) {
        return repository.deleteById(id);
    }
}
