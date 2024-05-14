package edu.jesus_fdez.evidencia3_sergio;


import edu.sergio_nolasco.evidencia3.ui.*;

public class Main {
    public static void main(String[] args) {
        try{
            CLI.launchGame();
        }catch (Exception e ){
            System.out.println(Idiomas.ERROR_INESPERADO +e);
        }
    }
}