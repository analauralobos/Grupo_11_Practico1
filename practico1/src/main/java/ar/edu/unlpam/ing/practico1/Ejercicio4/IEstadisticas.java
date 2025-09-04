package ar.edu.unlpam.ing.practico1.Ejercicio4;

import java.util.List;
import java.util.Map;

public interface IEstadisticas {
    Map<String, Object> calcular(List<Integer> numeros);
}

/* http://localhost:8080/estadisticas

{
  "numeros": [10, 20, 30, 40, 50]
}
  
*/