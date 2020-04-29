package somarepeticao;

import java.util.Scanner;

public class SomaRepeticao {

    public static void main(String[] args) {
        int num, soma = 0;
        String yn;
        Scanner input = new Scanner (System.in);
        
        do {
            System.out.print("Digite um número: ");
            num = input.nextInt();
            soma += num;
            System.out.print("Você quer continuar? [S/N] ");
            yn = input.next();
        } while (yn.equals("S"));
        System.out.println("A soma de todos os números é " + soma);
        
    }
    
}
