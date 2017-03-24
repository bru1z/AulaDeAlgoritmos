package algoritmos;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double n1, n2;
        
       
        System.out.print("Número 1: ");
        n1 = leitor.nextDouble();
        System.out.print("Número 2: ");
        n2 = leitor.nextDouble();
        
        n1 = Math.pow(5, 2);
        n2 = Math.pow(5, 2);
        
        System.out.println("Resultado: " +"5² = 5 * 5");
        System.out.println("Resultado: " +"5² = 5 * 5");
    }
   
}
