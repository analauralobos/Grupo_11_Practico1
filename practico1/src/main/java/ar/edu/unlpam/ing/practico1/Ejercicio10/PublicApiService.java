package ar.edu.unlpam.ing.practico1.Ejercicio10;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PublicApiService {

    private final RestTemplate restTemplate;

    public PublicApiService() {
        this.restTemplate = new RestTemplate();
    }

    public String consumirEndpoint(String endpoint) {
        return restTemplate.getForObject(endpoint, String.class);
    }
}