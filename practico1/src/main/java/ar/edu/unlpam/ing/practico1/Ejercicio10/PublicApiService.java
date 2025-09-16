package ar.edu.unlpam.ing.practico1.Ejercicio10;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PublicApiService {

    private final RestTemplate restTemplate;

    public PublicApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Consumir cualquier endpoint de la colección
    public String consumirEndpoint(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}

