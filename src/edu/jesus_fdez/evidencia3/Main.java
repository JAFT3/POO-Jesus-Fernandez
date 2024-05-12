package edu.jesus_fdez.evidencia3;
import edu.jesus_fdez.evidencia3.data.Simbolos;
import edu.jesus_fdez.evidencia3.ui.CLI;

import static edu.jesus_fdez.evidencia3.ui.CLI.launchApp;

public class Main {
    public static void main(String[] args){
        try{
            CLI.launchApp();
        }catch (Exception e ){
            System.out.println("Error inesperado " + e);
        }
    }
}
