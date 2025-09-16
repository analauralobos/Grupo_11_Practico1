package ar.edu.unlpam.ing.practico1.Ejercicio6;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService {
    private final NotaRepository repository;

    public NotaService(NotaRepository repository) {
        this.repository = repository;
    }

    public List<Nota> obtenerNotas() {
        return repository.findAll();
    }

    public Nota crearNota(Nota nota) {
        return repository.save(nota);
    }

    public Optional<Nota> obtenerNotaPorId(Long id) {
        return repository.findById(id);
    }

    public Nota actualizarNota(Long id, Nota nota) {
        return repository.update(id, nota);
    }

    public boolean eliminarNota(Long id) {
        return repository.delete(id);
    }
}
