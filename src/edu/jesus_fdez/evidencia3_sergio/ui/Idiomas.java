package edu.jesus_fdez.evidencia3_sergio.ui;

public class Idiomas {

    /**
     * Aqi se declaran las variables de idiomas
     */
    public static String BIENVENIDA;
    public static String SELECCIONE_OPCION;
    public static String PERSONAVPERSONA;
    public static String PERSONAVCOMPUTADORA;
    public static String JUGAR_DE_NUEVO;
    public static String RESPUESTA_INVALIDA;
    public static String GRACIAS_POR_JUGAR;
    public static String NUEVA_PARTIDA;
    public static String NOMBRE_JUGADOR1;
    public static String NOMBRE_VACIO;
    public static String SIMBOLO_JUGADOR1;
    public static String SIMBOLO_NO_VALIDO;
    public static String INGRESE_SIMBOLO;
    public static String NOMBRE_JUGADOR2;
    public static String NOMBRE_JUGADOR2_DIFERENTE;
    public static String SIMBOLO_JUGADOR2;
    public static String SIMBOLO_DIFERENTE;
    public static String HA_GANADO;
    public static String EMPATE;
    public static String NOMBRE;
    public static String TURNO;
    public static String FILA;
    public static String FILA_INVALIDA;
    public static String NUMERO_INVALIDO;
    public static String COLUMNA;
    public static String COLUMNA_INVALIDA;
    public static String CASILLA_OCUPADA;
    public static String ERROR_INICIALIZACION;
    public static String TABLERO;
    public static String COMPUTADORA_VICTORIA;
    public static String OPCION_INVALIDA;
    public static String ERROR_INESPERADO;

    /**Este metodo nos permite obtener la instancia del idioma que el usuario escoja para poder
     * asignarle un texto en dicho idioma a cada variable*/
    public static void getInstance(String idioma) {
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion) {
            case ESP:
                BIENVENIDA = "¡Bienvenido al juego de tres en raya!";
                SELECCIONE_OPCION = "Seleccione el modo de juego: ";
                PERSONAVPERSONA = "1. Jugador contra jugador";
                PERSONAVCOMPUTADORA = "2. Jugador contra la computadora";
                JUGAR_DE_NUEVO = "¿Desean jugar nuevamente? (si/no)";
                RESPUESTA_INVALIDA = "Respuesta inválida. Por favor, ingrese 'si' " +
                        "para jugar nuevamente o 'no' para terminar.";
                GRACIAS_POR_JUGAR = "Gracias por jugar. ¡Hasta luego!";
                NUEVA_PARTIDA = "Comencemos una nueva partida...";
                NOMBRE_JUGADOR1 = "Ingrese el nombre del jugador 1: ";
                NOMBRE_VACIO = "El nombre no puede estar vacío. Inténtelo de nuevo.";
                SIMBOLO_JUGADOR1 = "Ingrese el símbolo del jugador 1 (@ # $ % & X 0 ? + =): ";
                SIMBOLO_NO_VALIDO = "El símbolo ingresado no es válido. Por favor, elija un símbolo de la lista.";
                INGRESE_SIMBOLO = "Ingrese su símbolo (@ # $ % & X 0 ? + =): ";
                NOMBRE_JUGADOR2 = "Ingrese el nombre del jugador 2: ";
                NOMBRE_JUGADOR2_DIFERENTE = "El nombre del segundo jugador no puede ser " +
                        "igual al del primero. Inténtelo de nuevo.";
                SIMBOLO_JUGADOR2 = "Ingrese el símbolo del jugador 2 (diferente a: ";
                SIMBOLO_DIFERENTE = "El símbolo ingresado no es válido. " +
                        "Por favor, elija un símbolo de la lista diferente a: ";
                HA_GANADO = " ha ganado!";
                EMPATE = "¡El tablero está lleno! ¡Es un empate!";
                NOMBRE = "Ingrese su nombre: ";
                TURNO = "Turno de ";
                FILA = "Ingrese la fila (1-3): ";
                FILA_INVALIDA = "Fila inválida o llena. Debe ser un número entre 1 y 3 y no debe estar llena.";
                NUMERO_INVALIDO = "Debe ingresar un número de un solo digito entre 1 y 3. Inténtelo de nuevo.";
                COLUMNA = "Ingrese la columna (1-3): ";
                COLUMNA_INVALIDA = "Columna inválida o llena. Debe ser un número entre 1 y 3 y no debe estar llena.";
                CASILLA_OCUPADA = "La casilla seleccionada está ocupada. Intente de nuevo.";
                ERROR_INICIALIZACION = "Error: falta de inicialización de variables.";
                TABLERO = "Tablero:";
                COMPUTADORA_VICTORIA = "La computadora ha jugado en la posición [";

                OPCION_INVALIDA = "Opción inválida. Por favor, seleccione una opción válida.";
                ERROR_INESPERADO = "Error inesperado ";
                break;

            case ENG:
                BIENVENIDA = "Welcome to the game of tic-tac-toe!";
                SELECCIONE_OPCION = "Select game mode: ";
                PERSONAVPERSONA = "1. Player vs. player";
                PERSONAVCOMPUTADORA = "2. Player against computer";
                JUGAR_DE_NUEVO = "Do you wish to play again? (yes/no)";
                RESPUESTA_INVALIDA = "Invalid answer. Please enter ‘yes’ to play again or ‘no’ to end.";
                GRACIAS_POR_JUGAR = "Thank you for playing. See you later!";
                NUEVA_PARTIDA = "Let's start a new game...";
                NOMBRE_JUGADOR1 = "Enter the name of player 1: ";
                NOMBRE_VACIO = "The name cannot be empty. Please try again.";
                SIMBOLO_JUGADOR1 = "Enter the symbol of player 1 (@ # $ % & X 0 ? + =): ";
                SIMBOLO_NO_VALIDO = "The entered symbol is invalid. Please choose a symbol from the list.";
                INGRESE_SIMBOLO = "Enter your symbol (@ # $ % & X 0 ? + =): ";
                NOMBRE_JUGADOR2 = "Enter the name of player 2: ";
                NOMBRE_JUGADOR2_DIFERENTE = "The second player's name cannot be the same as the first " +
                        "player's name. Please try again.";
                SIMBOLO_JUGADOR2 = "Enter player 2’s symbol (other than: ";
                SIMBOLO_DIFERENTE = "The entered symbol is invalid. Please choose a symbol " +
                        "from the list other than: ";
                HA_GANADO = " have won!";
                EMPATE = "The board is full! It's a draw!";
                NOMBRE = "Enter your name: ";
                TURNO = "Turn of ";
                FILA = "Enter row (1-3): ";
                FILA_INVALIDA = "Invalid or full row. Must be a number between 1 and 3 and must not be full";
                NUMERO_INVALIDO = "You must enter a single digit number between 1 and 3. Try again.";
                COLUMNA = "Enter column (1-3): ";
                COLUMNA_INVALIDA = "Invalid or full column. Must be a number between 1 and 3 and must not be full.";
                CASILLA_OCUPADA = "The selected column is already full. Please try again.";
                ERROR_INICIALIZACION = "Error: variable initialisation failed.";
                TABLERO = "Board:";
                COMPUTADORA_VICTORIA = "The computer has played in position [";

                OPCION_INVALIDA = "Invalid option. Please select a valid option.";
                ERROR_INESPERADO = "Unexpected error ";
                break;

            case ARABIC:
                BIENVENIDA = "مرحبا بكم في لعبة تيك تاك تو！";
                SELECCIONE_OPCION = "شكرا جزيلا: ";
                PERSONAVPERSONA = "حدد وضع اللعبة:";
                PERSONAVCOMPUTADORA = "2. اللاعبين وأجهزة الكمبيوتر";
                JUGAR_DE_NUEVO = "هل تريد اللعب مرة أخرى؟ (لكن)";
                RESPUESTA_INVALIDA = "جواب غير صالح. أدخل \"نعم\" للعب مرة أخرى أو \"لا\" للخروج.";
                GRACIAS_POR_JUGAR = "شكرا لحضوركم للعب. أراك لاحقًا!";
                NUEVA_PARTIDA = "فلنبدأ لعبة جديدة..";
                NOMBRE_JUGADOR1 = "الرجاء إدخال اسم اللاعب:";
                NOMBRE_VACIO = "مطلوب اسم. حاول مرة اخرى.";
                SIMBOLO_JUGADOR1 = "الرجاء إدخال رمز اللاعب الأول (@ # $ % & X 0 ? + =):";
                SIMBOLO_NO_VALIDO = "الرمز الذي أدخلته غير صالح. الرجاء اختيار رمز من القائمة.";
                INGRESE_SIMBOLO = "الرجاء إدخال الرموز (@ # $ % & X 0 ? + =):";
                NOMBRE_JUGADOR2 = "الرجاء إدخال اسم اللاعب 2:";
                NOMBRE_JUGADOR2_DIFERENTE = "لا يمكن أن يكون اسم اللاعب الثاني هو نفس اسم اللاعب الأول. حاول مرة اخرى.";
                SIMBOLO_JUGADOR2 = "الرجاء إدخال رمز اللاعب 2 (يختلف عن:";
                SIMBOLO_DIFERENTE = "الرمز الذي أدخلته غير صالح. الرجاء اختيار رمز من قائمة أخرى:";
                HA_GANADO = "فاز!";
                EMPATE = "اللوحة ممتلئة! إنه التعادل!";
                    NOMBRE = "من فضلك أدخل إسمك:";
                TURNO = "الآن أنت.";
                FILA = "الرجاء إدخال السطر (1-3):";
                FILA_INVALIDA = "الصف غير صالح أو مكتمل. الأرقام من 1 إلى 3 يجب ألا تكون كاملة.";
                NUMERO_INVALIDO = "الرجاء إدخال رقم بين 1 و 3. اكتبها مرة أخرى.";
                COLUMNA = "الرجاء إدخال الأعمدة (1-3): ";
                COLUMNA_INVALIDA = "العمود غير صالح أو ممتلئ. يجب أن يكون رقمًا من واحد إلى ثلاثة ويجب ألا يكون كاملاً.";
                CASILLA_OCUPADA = "المربع المحدد ممتلئ. حاول مرة اخرى.";
                ERROR_INICIALIZACION = "خطأ: تهيئة المتغير مفقودة.";
                TABLERO = "خطأ: تهيئة المتغير مفقودة.";
                COMPUTADORA_VICTORIA = "\"تلعب أجهزة الكمبيوتر دورًا[";

                OPCION_INVALIDA = "خيار غير صالح. الرجاء تحديد خيار صالح. ";
                ERROR_INESPERADO = "خطأ غير متوقع";
                break;
            default:
                throw new IllegalArgumentException("Invalid language selection");
        }
    }

    private enum Textos {
        ESP, ENG, ARABIC
    }
}