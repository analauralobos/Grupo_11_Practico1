package ar.edu.unlpam.ing.practico1.Ejercicio2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimoController {

    @GetMapping("/esPrimo/{numero}")
    public Map<String, Object> verificarPrimo(@PathVariable int numero) {
        Primo primo = new Primo();
        boolean resultado = primo.esPrimo(numero);

        Map<String, Object> response = new HashMap<>();
        response.put("numero", numero);
        response.put("esPrimo", resultado);

        return response;
    }
}
