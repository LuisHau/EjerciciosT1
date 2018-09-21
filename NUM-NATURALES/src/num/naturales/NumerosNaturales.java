
package num.naturales;

public class NumerosNaturales {
    
    int n;
    NumerosNaturales(int w){
    this.n=w;
}
    int Cero(){
        n=0;
    return n;
    }
    int Sucesor()
    {
        n++;
        return n;
    }
    int Antecesor(){
        n--;
        return n;
    }
   String Escero()
   {
       String r;
       if (n==0)
           r=" ES CERO ";
       else 
           r=" No es cero";
       return r;
   }
   String Igual(int c)
   {
       String r;
       if (n==c)
           r=" ES IGUAL ";
       else
           r=" NO ES IGUAL ";
       return r;
   }
   int Suma(int c){
       int r;
       r=n+c;
       return r;
   }
   String Menor(int c){
       String r;
       if (n<c){
           r=" ES MENOR ";
       }
       else 
           r=" ES MAYOR ";
       return r;
   }
   int Diferencia(int c){
       
       int r;
       r=n-c;
       return r;
   }
    
}
