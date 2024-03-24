package edu.jesus_fdez.reto7.process;

public class Multiplicacion extends Suma{
    public double calcular(double numero1, double numero2){

        double resultado = 0;
        for (int i = 0; i < numero2; i++){
            resultado= new Suma().calcular(resultado,numero1);
        }
        return resultado;
    }
}
