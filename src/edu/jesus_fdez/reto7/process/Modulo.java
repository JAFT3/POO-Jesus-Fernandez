package edu.jesus_fdez.reto7.process;

public class Modulo extends Resta{
    public double calcular(double numero1, double numero2){
        while (numero1>=numero2){
            numero1 = new Resta().calcular(numero1,numero2);
        }
        return numero1;
    }
}
