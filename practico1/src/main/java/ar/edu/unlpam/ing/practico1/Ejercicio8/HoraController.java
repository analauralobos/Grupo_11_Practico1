package ar.edu.unlpam.ing.practico1.Ejercicio8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class HoraController {

    @GetMapping("/hora")
    public HoraResponse convertirHora(
            @RequestParam String fecha,
            @RequestParam String origen,
            @RequestParam String destino) {

        // Parsear la fecha de entrada
        LocalDateTime localDateTime = LocalDateTime.parse(fecha);

        // Convertir a la zona de origen
        ZonedDateTime horaOrigen = localDateTime.atZone(ZoneId.of(origen));

        // Convertir a la zona de destino
        ZonedDateTime horaDestino = horaOrigen.withZoneSameInstant(ZoneId.of(destino));

        // Devolver respuesta con ambos valores en formato ISO
        return new HoraResponse(
                horaOrigen.toString(),
                horaDestino.toString()
        );
    }
}
