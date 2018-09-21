
package ejerciciosconjuntos;
import java.io.*;
import OperacionesC.Vectores;


public class EjerciciosConjuntos {
    public static void main(String[] args) throws IOException {
       Vectores tabla = new Vectores();
       
       System.out.println("CONJUNTO VACIO");
       tabla.conjuntoVacio();
       tabla.LLenar();
       
       tabla.Mostrar();
       
       System.out.println("UNION CONJUNTO DE A Y B ");
       tabla.Union();
       System.out.println("INTERSECCION CONJUNTO A Y B");
       tabla.Interseccion();
       System.out.println("DIFERENCIA CINJUNTO A Y B");
       tabla.Diferencia();
       
       tabla.insertarElemento();
      
    }
    
}
