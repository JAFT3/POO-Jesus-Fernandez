package edu.jesus_fdez.evidencia1;

import edu.jesus_fdez.evidencia1.ui.CLI;

import edu.jesus_fdez.evidencia1.data.Medicamento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        CLI.launchApp(medicamentos);
        System.out.println(medicamentos);
    }
}