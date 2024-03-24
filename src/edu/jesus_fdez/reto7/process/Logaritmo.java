package edu.jesus_fdez.reto7.process;

public class Logaritmo extends Operacion{
    public double calcular(double numero1, double numero2){
        double logNumero = Math.log(numero1);
        double logBase = Math.log(numero2);

        Division division = new Division();
        return division.calcular(logNumero, logBase);
    }
}
