package operadorternario;

import java.util.Scanner;

public class OperadorTernario {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, maior;
        
        System.out.println("Digite dois números para serem comparados");
        System.out.print("Primeiro número: ");
        n1 = input.nextInt();
        System.out.print("Segundo número: ");
        n2 = input.nextInt();
        
        maior = (n1>n2)?n1:n2;
        
        System.out.printf("O maior número entre %d e %d é %d!\n", n1, n2, maior);
        
    }
    
}
