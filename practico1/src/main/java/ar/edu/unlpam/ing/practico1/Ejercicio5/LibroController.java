package ar.edu.unlpam.ing.practico1.Ejercicio5;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")//ruta general
public class LibroController {
    private final LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    // POST /libros → agrega un libro
    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return service.agregarLibro(libro);
    }

    // GET /libros → lista todos
    @GetMapping
    public List<Libro> obtenerLibros() {
        return service.obtenerLibros();
    }

    // GET /libros/{id} → busca por id
    @GetMapping("/{id}")
    public Optional<Libro> obtenerLibroPorId(@PathVariable Long id) {
        return service.obtenerLibroPorId(id);
    }

    // DELETE /libros/{id} → elimina por id
    @DeleteMapping("/{id}")
    public String eliminarLibro(@PathVariable Long id) {
        boolean eliminado = service.eliminarLibro(id);
        return eliminado ? "Libro eliminado correctamente"
                         : "Libro no encontrado";
    }
}
