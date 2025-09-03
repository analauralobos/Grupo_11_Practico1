package ar.edu.unlpam.ing.practico1.Ejercicio1;

public class Conversor implements IConversor {

    @Override
    public double celciusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
