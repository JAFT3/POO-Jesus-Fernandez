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
       estatura /= 100;
        return peso/Math.pow(estatura, 2);
    }
    public static String clasificarIndiceMasaCorporal(double imc){
        String value = "";
        if (imc<=18){
            value = "Peso bajo";
        }else if(imc<=24.99) {
            value = "Peso normal";
        }
        else if (imc <= 29.99) {
            value = "Sobrepeso";
        }
        else if (imc <= 34.99) {
            value = "Obesidad leve";
        }
        else if (imc <= 39.99) {
            value = "Obesidad media";
        }else {
            value = "Obesidad morbida";
        }
        return value;
    }
}
