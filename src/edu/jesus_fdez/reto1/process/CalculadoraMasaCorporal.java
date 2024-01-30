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
        /** En este metodo, mediante el imc que nos da el metodo anterior lo clasificamos dentro
        * de las distintos rangos correspondientes. **/
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
    public static double calcularMasaCorporalMagra(double estatura, double peso, String sexo){
        /** Este metodo nos ayudara a obtener la cantidad de Masa Corporal Magra
         * mediante el sexo, estatura y peso.
         * @param sexo se solicita como la inicial del genero (M o F)**/
        if (sexo.equals("M")){
            return (1.10 * peso) - 128 * (Math.pow(peso, 2) / Math.pow(estatura, 2));
        }else if (sexo.equals("F")){
            return (1.07 * peso) - 148 * (Math.pow(peso, 2) / Math.pow(estatura, 2));
        }
        else{
            System.out.println("Valor no reconocido.");
        }
        return 0;
    }
    public static double calcularMetabolismoBasal(double estatura, double peso, String sexo, int edad){
        /**En este metodo utilizaremos una nueva variable que sera la edad del usuario
         * para poder calcular el gasto energetico mediante la formula de Harris-Beredict**/
        if (sexo.equals("M")){
            return  66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
        }else if (sexo.equals("F")){
            return 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        }
        else{
            System.out.println("Valor no reconocido.");
        }
        return 0;
    }
}
