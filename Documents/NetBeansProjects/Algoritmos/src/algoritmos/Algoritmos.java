package algoritmos;

import java.util.Scanner;



public class Algoritmos {

    public static void main(String[] args) {
      
       Scanner leitor = new Scanner(System.in);
      
        
      double n1, n2;
        
        System.out.print("Primeiro Número: ");
        n1 = leitor.nextDouble();
        System.out.print("Segundo Número: ");
        n2 = leitor.nextDouble();
        
        
        System.out.println("Resultado: " + n1*n2);
               
        
    }
    
}
