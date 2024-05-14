package edu.jesus_fdez.evidencia3;

import edu.jesus_fdez.evidencia3.ui.*;

public class Main {
    public static void main(String[] args) {
        try{
            CLI.launchApp();
        }catch (Exception e ){
            System.out.println(Idiomas.ERROR_INESPERADO +e);
        }
    }
}