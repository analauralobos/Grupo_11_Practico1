package ar.edu.unlpam.ing.practico1.Ejercicio4;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadisticasController {

    // Clase auxiliar para mapear el JSON de entrada
    public static class NumerosRequest {
        public List<Integer> numeros;
    }

    @PostMapping("/estadisticas")
    public Map<String, Object> calcularEstadisticas(@RequestBody NumerosRequest request) {
        Estadisticas est = new Estadisticas();
        return est.calcular(request.numeros);
    }
}
