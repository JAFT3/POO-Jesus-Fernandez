package edu.jesus_fdez.reto1.process;
/**
 * Esta clase sirve para realizar calculos
 * de masa corporal incluye los metodos:
 * indice de masa corporal
 * masa corporal madre
 * **/
public class CalculadoraMasaCorporal {
    /**
     * Este metodo sirve para calcular el Indice de Masa Corproal de una persona
     * mediante la estatura y el peso
     * @param estatura  se solicita en centimetros
     * @param peso se solicita en kilogramos
     * @return indice de masa corproral
     **/
    public static double calcularIndiceMasaCorporal(double estatura, double peso){
`       estatura /= 100;
        return peso/Math.pow(estatura, 2);
    }
    public static String clasificarIndiceMasaCorporal(Double imc){
        String value = "";
        return switch (value)
    }
}
