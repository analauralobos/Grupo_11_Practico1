package ar.edu.unlpam.ing.practico1.Ejercicio8;

public class HoraResponse {
    private String origen;
    private String destino;

    public HoraResponse(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}
