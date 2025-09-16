package ar.edu.unlpam.ing.practico1.Ejercicio6;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Nota {
    private Long id;
    private String titulo;
    private String contenido;
    private LocalDateTime fechaCreacion;

    public Nota() {}

    public Nota(Long id, String titulo, String contenido, LocalDateTime fechaCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
    }

}
