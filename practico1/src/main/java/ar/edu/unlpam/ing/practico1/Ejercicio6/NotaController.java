package ar.edu.unlpam.ing.practico1.Ejercicio6;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotaController {
    private final NotaService service;

    public NotaController(NotaService service) {
        this.service = service;
    }

    // GET /notas
    @GetMapping
    public List<Nota> obtenerNotas() {
        return service.obtenerNotas();
    }

    // POST /notas
    @PostMapping
    public Nota crearNota(@RequestBody Nota nota) {
        return service.crearNota(nota);
    }

    // PUT /notas/{id}
    @PutMapping("/{id}")
    public Nota actualizarNota(@PathVariable Long id, @RequestBody Nota nota) {
        return service.actualizarNota(id, nota);
    }

    // DELETE /notas/{id}
    @DeleteMapping("/{id}")
    public String eliminarNota(@PathVariable Long id) {
        boolean eliminado = service.eliminarNota(id);
        return eliminado ? "Nota eliminada correctamente"
                         : "Nota no encontrada";
    }
}
