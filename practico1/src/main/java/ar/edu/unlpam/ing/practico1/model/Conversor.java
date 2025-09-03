package ar.edu.unlpam.ing.practico1.model;

import ar.edu.unlpam.ing.practico1.interfaces.IConversor;

public class Conversor implements IConversor {

    @Override
    public double celciusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
