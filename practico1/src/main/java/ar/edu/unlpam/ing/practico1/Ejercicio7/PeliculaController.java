package ar.edu.unlpam.ing.practico1.Ejercicio7;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    private final PeliculaService service;

    public PeliculaController(PeliculaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pelicula> listarTodas() {
        return service.obtenerTodas();
    }

    @GetMapping("/buscar")
    public List<Pelicula> buscarPorTitulo(@RequestParam String titulo) {
        return service.buscarPorTitulo(titulo);
    }

    @PostMapping
    public Pelicula agregar(@RequestBody Pelicula pelicula) {
        return service.agregar(pelicula);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "Película eliminada correctamente";
    }
}
