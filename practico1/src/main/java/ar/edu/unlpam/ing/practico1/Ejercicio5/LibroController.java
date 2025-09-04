package ar.edu.unlpam.ing.practico1.Ejercicio5;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroDAO libroDAO;

    public LibroController(LibroDAO libroDAO) {
        this.libroDAO = libroDAO;
    }

    @GetMapping
    public List<Libro> getAll() {
        return libroDAO.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getById(@PathVariable int id) {
        return libroDAO.getById(id);
    }

    @PostMapping
    public Libro add(@RequestBody Libro libro) {
        return libroDAO.add(libro);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        boolean eliminado = libroDAO.delete(id);
        return eliminado ? "Libro eliminado" : "Libro no encontrado";
    }
}