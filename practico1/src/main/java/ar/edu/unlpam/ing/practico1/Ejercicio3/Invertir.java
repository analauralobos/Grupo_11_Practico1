package ar.edu.unlpam.ing.practico1.Ejercicio3;

public class Invertir implements IInvertir {

    @Override
    public String invertir(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }
}
