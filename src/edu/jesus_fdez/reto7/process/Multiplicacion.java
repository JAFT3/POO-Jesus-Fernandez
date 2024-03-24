package edu.jesus_fdez.reto7.process;

public class Multiplicacion extends Operacion{
    public double calcular(double numero 1, double numero2){

        double resultado = 0;
        for (int i = 0; i < numero2; i++){
            resultado= new Suma().calcular(resultado,numero);
        }
        return resultado;
    }
}
