package edu.jesus_fdez.evidencia3.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simbolos {
    /**Simbolos Basicos**/
    public static final String TACHA = "\u2717";
    public static final String CIRCULO = "\u25CB";

    /**Simbolos adicionales**/
    public static final String ESTRELLA = "\u2605";
    public static final String SOL = "\u263C";
    public static final String PICA = "\u2660";
    public static final String DIAMANTE = "\u2666";
    public static final String TREBOL = "\u2663";
    public static final String CORAZON = "\u2764";
    public static final String PAZ = "\u262E";
    public static final String SONRIENTE = "\u263A";
    public static final String ANCLA = "\u2693";
    public static final String PARAGUAS = "\u2602";
    public static final char[] ROBOT = Character.toChars(0x1F916); // 0x1F916 es el código Unicode de U+1F916


    public static final List<String> listaSimbolos = new ArrayList<>();
    public static final Map<String, Character> simbolosConValor = new HashMap<>();

    static {
        simbolosConValor.put(TACHA, '8');
        simbolosConValor.put(CIRCULO, 'A');
        simbolosConValor.put(ESTRELLA, '6');
        simbolosConValor.put(SOL, 'B');
        simbolosConValor.put(PICA, '1');
        simbolosConValor.put(DIAMANTE, '7');
        simbolosConValor.put(TREBOL, '3');
        simbolosConValor.put(CORAZON, '5');
        simbolosConValor.put(PAZ, 'C');
        simbolosConValor.put(SONRIENTE, '9');
        simbolosConValor.put(ANCLA, '4');
        simbolosConValor.put(PARAGUAS, '2');

        listaSimbolos.addAll(simbolosConValor.keySet());
        listaSimbolos.remove(ROBOT);
        listaSimbolos.stream().sorted();
    }
    public List<String> getListaSimbolos(){
        return listaSimbolos;
    }
}
