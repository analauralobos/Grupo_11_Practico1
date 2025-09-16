package ar.edu.unlpam.ing.practico1.Ejercicio7;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PeliculaRepository {
    private final List<Pelicula> peliculas = new ArrayList<>();
    private Long currentId = 1L;

    public List<Pelicula> findAll() {
        return peliculas;
    }

    public Pelicula save(Pelicula pelicula) {
        pelicula.setId(currentId++);
        peliculas.add(pelicula);
        return pelicula;
    }

    public Optional<Pelicula> findById(Long id) {
        return peliculas.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteById(Long id) {
        peliculas.removeIf(p -> p.getId().equals(id));
    }

    public List<Pelicula> findByTitulo(String titulo) {
        return peliculas.stream()
                .filter(p -> p.getTitulo().equalsIgnoreCase(titulo))
                .toList();
    }
}
