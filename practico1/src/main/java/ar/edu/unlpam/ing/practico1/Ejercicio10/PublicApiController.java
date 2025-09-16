package ar.edu.unlpam.ing.practico1.Ejercicio10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicApiController {

    private final PublicApiService apiService;

    public PublicApiController(PublicApiService apiService) {
        this.apiService = apiService;
    }

    // GET /publicapi?endpoint=<URL del endpoint de Postman>
    @GetMapping("/publicapi")
    public String consumir(@RequestParam String endpoint) {
        return apiService.consumirEndpoint(endpoint);
    }
}

