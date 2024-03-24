package edu.jesus_fdez.reto7.process;

public class Potencia extends Operacion{
    public double calcular(double numero1, double numero2){
        double resultado = 0;
        for (int i = 0; i < numero2; i++){
            resultado = new Multiplicacion().calcular(resultado, numero1);
        }
        return resultado;
    }
}
