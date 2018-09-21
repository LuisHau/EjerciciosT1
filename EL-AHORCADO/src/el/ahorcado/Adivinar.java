
package el.ahorcado;

import java.util.Scanner;

public class Adivinar {
    /**
     * ESTO DESGUAZA EL STRING EN UN ARRAY DE CARACTERES
     *
     * @ARRAY RETURN LETRAS
     */
    protected static char[] separador(String palAzar) {
        char[] letras;
        letras = new char[palAzar.length()];
        for (int i = 0; i < palAzar.length(); i++) {
            letras[i] = palAzar.charAt(i);
        }
        return letras;
    }
    
    
    /**
     * ESTO IMPRIME LA PALABRA ESPACIOS
     *
     * @PARAM TUSRESPUESTAS EL ARRAY CARACTERES
     */
    protected static void imprimeOculta(char[] tusRespuestas) {

        for (int i = 0; i < tusRespuestas.length; i++) {
            System.out.print(tusRespuestas[i] + " ");
        }
    }
    
    
    /**
     * ESTO NOS PREGUNTA SI QUEREMOS VOLVER A JUGAR Y COMPRUEBA LOS CARACTERES
     * INTRODUCIDOS EL MEN TEXTO PARA MOSTRAR AL USUARIO
     *
     * @RETURN CARACTER DE RESPUESTA (S/N)
     */
    public static char preguntar(String men, Scanner teclado) {
        char resp;
        System.out.println(men + " (s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while (resp != 's' && resp != 'n') {
            System.out.println("Error! solo se admite S o N");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
}
