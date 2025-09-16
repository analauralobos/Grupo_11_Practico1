package ar.edu.unlpam.ing.practico1.Ejercicio10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicApiController {

    private final PublicApiService service;

    public PublicApiController(PublicApiService service) {
        this.service = service;
    }

    @GetMapping("/publicapi")
    public String consumir(@RequestParam String endpoint) {
        return service.consumirEndpoint(endpoint);
    }
}
