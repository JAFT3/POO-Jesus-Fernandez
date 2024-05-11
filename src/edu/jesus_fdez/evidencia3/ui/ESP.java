package edu.jesus_fdez.evidencia3.ui;

public class ESP extends Idiomas{
    public ESP(){
        MENU_IDIOMA = "------------------Idioma------------------\nDigite el idioma (Type the language)" +
                "\n1. Español (ESP)\n2. English (ENG)}\n3. Mandarin(MAND)\n------------------------------------------";
        MENU = "----------MODO DE JUEGO----------\n1.Jugador vs Jugador\n2.Jugador vs Computadora\n3.Salir";
        ERROR_IDIOMA = "Idioma no disponible, intentelo de nuevo.";
        ERROR_GAMEMODE = "Opcion NO disponible.";
        NOMBRE1 = "Ingrese el nombre del primer jugador: ";
        SIMBOLO = "Estos son los simbolos disponibles seleccione su favorito: ";
        NOMBRE2 = "Ingrese el nombre del segundo jugador: ";
        ELEGIR_SIMBOLO = "Elegir un simbolo: ";
        ERROR_SIMBOLO = "Simbolo no disponible, eliga uno de la lista.";
        SIMBOLO_FAV = "Este es tu simbolo favorito: ";
        ERROR_NOMBRES_IGUALES = "Los nombres no pueden ser iguales intentelo de nuevo: ";
    }
}
