package algoritmos;

import java.util.Scanner;

public class Potência {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double n1, n2;
        
        System.out.println("Número 1: ");
        n1 = leitor.nextDouble();
        System.out.println("Número 2: ");
        n2 = leitor.nextDouble();
        System.out.println("Resultado: " +Math.pow(n1, n2));
        
    }
}
