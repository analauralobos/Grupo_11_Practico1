package ar.edu.unlpam.ing.practico1.Ejercicio9;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiService {

    private final RestTemplate restTemplate;

    public ApiService() {
        this.restTemplate = new RestTemplate();
    }

    public String consumirApi(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}