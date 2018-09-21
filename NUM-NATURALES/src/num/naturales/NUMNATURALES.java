
package num.naturales;
import java.util.Scanner;

public class NUMNATURALES {
   
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("BIENVENIDO A LAS OPERACIONES DE LOS NUMEROS NATURALES");
        int w;
        int elige;
        
        do{
           System.out.println("1.- CERO");
           System.out.println("2.- SUCESOR");
           System.out.println("3.- EL NUMERO ES ");
           System.out.println("4.- LOS NUMEROS SON IGUALES");
           System.out.println("5.- SUMA DE LOS NUMEROS");
           System.out.println("6.- ANTECESOR");
           System.out.println("7.- DIFERENCIA");
           System.out.println("8.- MENOR");
           System.out.println("ELIGE UNA OPCION");
           elige = teclado.nextInt();
           System.out.println("INGRESE UN NUMERO NATURAL ");
            w=teclado.nextInt();
           NumerosNaturales ob1=new NumerosNaturales(w);
           if(elige == 1){
                System.out.println(ob1.Cero());
                    
           }
           else if(elige==2){
               System.out.println("EL NUMERO SUCESOR DE " +w+ " ES: " + ob1.Sucesor());
           }
           else if (elige==3){
               System.out.println(ob1.Escero());
           }
           else if (elige==4){
               int a;
               System.out.println("INGRESE UN NUEVO NUMERO");
               a=teclado.nextInt();
               System.out.println("EL NUMERO " + w + ob1.Igual(a) + "  A "+ a );
           }
           
           else if (elige==5){
               int b;
               System.out.println("INGRESE UN NUMERO ");
               b=teclado.nextInt();
               System.out.println("LA SUMA DE LOS NUMEROS ES: "+ ob1.Suma(b));
           }
           
           else if (elige==6){
                System.out.println("EL NUMERO ANTECESOR DE "+w+" ES: " + ob1.Antecesor());
           }
           
           else if (elige==7){
               int c;
               System.out.println("INGRESE UN NUEVO NUMERO");
               c=teclado.nextInt();
               System.out.println("LA DIFERENCIA DE " + w + " ES: " + ob1.Diferencia(c));
           }
           
           else if (elige==8){
               int d;
               System.out.println("INGRESE UN NUEVO NUMERO");
               d=teclado.nextInt();
               System.out.println("EL NUMERO : " + w + ob1.Menor(d)+ " A " + d);
           }
        }while(elige!=8);
    }
        
}
    
