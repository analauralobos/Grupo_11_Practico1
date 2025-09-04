package ar.edu.unlpam.ing.practico1.Ejercicio3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvertirController {

    @GetMapping("/invertir/{cadena}")
    public Map<String, Object> invertirCadena(@PathVariable String cadena) {
        Invertir inv = new Invertir();
        String resultado = inv.invertir(cadena);

        Map<String, Object> response = new HashMap<>();
        response.put("original", cadena);
        response.put("invertida", resultado);

        return response;
    }
}
