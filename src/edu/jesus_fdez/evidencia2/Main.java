package edu.jesus_fdez.evidencia2;

import edu.jesus_fdez.evidencia2.ui.CLI;
import edu.jesus_fdez.evidencia2.ui.Idiomas;

public class Main {
    public static void main(String[] args) {
        try{
            CLI.launchApp();
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
