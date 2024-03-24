package edu.jesus_fdez.reto7.process;

public class Division extends Resta{
    public double calcular(double numero1, double numero2){
        double resultado = 0;
        while (numero1>numero2){
            numero1 = new Resta().calcular(numero1, numero2);
            resultado++;
        }
        return resultado;
    }
}
