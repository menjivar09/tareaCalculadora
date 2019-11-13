//Ejercicio3

package evaluacion;

public class Evaluacion {

   public static void main(String args[]) {
        int M = 6;
        int T = 1;
        int K = -10;

        if ( M > T)
        {
            System.out.println("M > T = Verdadero");
        } else {
           
            System.out.println("M > T = Falso");
        }
       
        if ( T / K == -5)
        {
            System.out.println("T / K es -5 = Verdadero");
        } else {
            System.out.println("T / K es -5 = Falso");
        }
       
        if ( M + T ==7 || M - T == 5)
        {
            System.out.println("M+T=7 O M-T=5 = Verdadero");
        } else {
             System.out.println("M+T=7 O M-T=5 = Falso");
        }
    } 
}