package edu.jesus_fdez.reto7.process;

public class Raiz extends Multiplicacion{
    public double calcular(double numero1, double numero2){
        double raiz;
        double pruebaPotencias = 0;
        double validacion = 0;
        double aproximacion = 1;

        while (pruebaPotencias < numero1) {
            validacion = aproximacion;
            pruebaPotencias = 1;
            for (int i = 0; i < numero2; i++) {
                pruebaPotencias = super.calcular(pruebaPotencias, aproximacion);
            }
            aproximacion++;
        }
        raiz = validacion;

        return raiz;
    }
}
