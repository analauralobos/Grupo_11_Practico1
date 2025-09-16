package ar.edu.unlpam.ing.practico1.Ejercicio9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    // GET /consumir?url=https://api.publicapis.org/entries
    @GetMapping("/consumir")
    public String consumir(@RequestParam String url) {
        return apiService.consumirApi(url);
    }
}

