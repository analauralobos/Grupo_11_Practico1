package ar.edu.unlpam.ing.practico1.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping("/celsiusAfahrenheit/{celsius}")
    public Map<String, Object> convertir(@PathVariable double celsius) {
        Conversor conversor = new Conversor();
        double fahrenheit = conversor.celciusAFahrenheit(celsius);

        Map<String, Object> response = new HashMap<>();
        response.put("celsius", celsius);
        response.put("fahrenheit", fahrenheit);

        return response;
    }
}
