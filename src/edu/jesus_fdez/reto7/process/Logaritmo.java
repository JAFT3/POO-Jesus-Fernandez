package edu.jesus_fdez.reto7.process;

public class Logaritmo extends Division{
    public double calcular(double numero1, double numero2){
        double logaritmo = 0;
        double argumento = numero1;
        while (argumento > 1) {
            argumento = super.calcular(argumento, numero2);
            logaritmo++;
        }
        return logaritmo;
    }
}
