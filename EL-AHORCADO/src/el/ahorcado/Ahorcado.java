package el.ahorcado;

import java.util.Scanner;
import java.util.Random;

public class Ahorcado {

    public static void main(String[] args) {

        //INSTANCIAS
        Adivinar m = new Adivinar();
        int intentos = 0;
        int aciertos = 0;
        //final int intentoTotal = 7; //CONSTANTE CON EL LIMITE DE FALLOS

        // PARA LEER EL TECLADO
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        char resp;
        // PARA IDENTIFICAR UNA PALABRA EN EL AZAR
        Random rnd = new Random();
        // CREAMOS UNAS PALABRAS Y LE ASIGNAMOSUNA ALEATORIA A UNA VARIABLE
        String arrayPalabras[] = {"hola", "mundo", "libro", "biblioteca", "casa", "persona"};

        do {
            // SE DEMOSTRO LA PALABRA Y SE GUARDO EN UN ARRAY DE CARACTERES 
            int aleatorio = rnd.nextInt(arrayPalabras.length);
            
            String palabra = arrayPalabras[aleatorio];
            //INTENTOS
            int intentoTotal = palabra.length() + 3;
            char[] caracteresPalabra = m.separador(palabra);
            char[] copia = m.separador(palabra); // ALGO AUXILIAR PARA MAS TARDE
            // ARREGLO PARA PINTAR COSAS EN PANTALLA COMO (GUIONES O LETRAS VAMOS)

           
            char[] tusRespuestas = new char[caracteresPalabra.length];

            // DONDE SE RELLENA PALABRAS CON GUIONES
            for (int i = 0; i < tusRespuestas.length; i++) {
                tusRespuestas[i] = '_';
            }

            // SE COMIENZA A PINTAR COSAS EN PANTALLA
            System.out.println("ADIVINA LA PALABRA!");

            // MIENTRAS QUE SE PASE A LOS INTENTOS Y NO SE ASERTE...
            while (intentos < intentoTotal && aciertos != tusRespuestas.length) {
                m.imprimeOculta(tusRespuestas);

                // SE PREGUNTA COSAS POR EL TECLADO
                System.out.println("\nINGRESE UNA LETRA: ");
                resp = teclado.next().toLowerCase().charAt(0);

                // RECORDEMOS EL ARREGLO Y COMPROBAMOS SI SE A PRODUCIDO UN ACIERTO
                for (int i = 0; i < caracteresPalabra.length; i++) {
                    if (caracteresPalabra[i] == resp) {
                        tusRespuestas[i] = caracteresPalabra[i];
                        caracteresPalabra[i] = ' ';
                        aciertos++;
                    }
                }
                intentos++;
            }
            // DESPUES DE ACERTAR TODO SE IMPRIME UN MENSAJE
            if (aciertos == tusRespuestas.length) {
                System.out.print("\nFELICIDADES!! HAS ACERTADO LA PALABRA: ");
                m.imprimeOculta(tusRespuestas);
            } // SI OTRO NO
            else {
                System.out.print("\nHAZ FALLADO! LA PALABRA ES: ");
                for (int i = 0; i < copia.length; i++) {
                    System.out.print(copia[i] + " ");
                }
            }
            // SE RESETEA LOS C0NTADORES 
            intentos = 0;
            aciertos = 0;
            // SE VUELVE A PREGUNTAR AL USUARIO SI LO QUIERE INTENTAR DE NUEVO
            resp = m.preguntar("\n\nQUIERES VOLVER A JUGAR?", teclado);
        } while (resp != 'n');

    }

}
