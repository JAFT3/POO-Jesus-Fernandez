package edu.jesus_fdez.reto9;

import edu.jesus_fdez.reto9.ui.CLI;
import edu.jesus_fdez.reto9.ui.Idiomas;

public class Main {
    public static void main(String[] args){
        try {
            CLI.launchApp();
        }catch (Exception e){
            System.out.println(Idiomas.ERROR);
        }
    }
}
