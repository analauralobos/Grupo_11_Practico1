package ar.edu.unlpam.ing.practico1.Ejercicio6;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class NotaRepository {
    private final List<Nota> notas = new ArrayList<>();
    private Long currentId = 1L;

    public List<Nota> findAll() {
        return notas;
    }

    public Nota save(Nota nota) {
        nota.setId(currentId++);
        nota.setFechaCreacion(LocalDateTime.now());
        notas.add(nota);
        return nota;
    }

    public Optional<Nota> findById(Long id) {
        return notas.stream().filter(n -> n.getId().equals(id)).findFirst();
    }

    public Nota update(Long id, Nota nuevaNota) {
        Optional<Nota> existente = findById(id);
        if (existente.isPresent()) {
            Nota nota = existente.get();
            nota.setTitulo(nuevaNota.getTitulo());
            nota.setContenido(nuevaNota.getContenido());
            return nota;
        }
        return null;
    }

    public boolean delete(Long id) {
        return notas.removeIf(n -> n.getId().equals(id));
    }
}
