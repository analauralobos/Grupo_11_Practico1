package ar.edu.unlpam.ing.practico1.Ejercicio7;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {
    private final PeliculaRepository repository;

    public PeliculaService(PeliculaRepository repository) {
        this.repository = repository;
    }

    public List<Pelicula> obtenerTodas() {
        return repository.findAll();
    }

    public Pelicula agregar(Pelicula pelicula) {
        return repository.save(pelicula);
    }

    public List<Pelicula> buscarPorTitulo(String titulo) {
        return repository.findByTitulo(titulo);
    }

    public Optional<Pelicula> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
