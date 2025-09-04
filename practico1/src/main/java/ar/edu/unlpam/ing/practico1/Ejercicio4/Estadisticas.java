package ar.edu.unlpam.ing.practico1.Ejercicio4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estadisticas implements IEstadisticas {

    @Override
    public Map<String, Object> calcular(List<Integer> numeros) {
        Map<String, Object> response = new HashMap<>();

        if (numeros == null || numeros.isEmpty()) {
            response.put("error", "La lista no puede estar vacía");
            return response;
        }

        int min = numeros.stream().min(Integer::compare).get();
        int max = numeros.stream().max(Integer::compare).get();
        double promedio = numeros.stream().mapToInt(Integer::intValue).average().orElse(0);
        int cantidad = numeros.size();

        response.put("promedio", promedio);
        response.put("min", min);
        response.put("max", max);
        response.put("cantidad", cantidad);

        return response;
    }
}