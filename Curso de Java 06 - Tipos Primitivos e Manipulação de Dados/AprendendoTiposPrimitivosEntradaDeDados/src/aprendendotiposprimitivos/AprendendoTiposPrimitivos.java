// Treino de tipos primitivos, declaração de variáveis, etc...
package aprendendotiposprimitivos;

import java.util.Scanner;

/**
 * @author Jamerson Aguiar
 */
public class AprendendoTiposPrimitivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // entrada é um objeto para monitorar entradas.
        System.out.print("Digite o nome do aluno: "); // Mensagem exibida pelo programa para gerar interatividade.
        String nome = entrada.nextLine(); /* A variável nome é da família dos literais, classe invólucro String.
                                           * O objeto entrada está lendo uma string do usuário usando o método nextLine.
                                           */
        System.out.print("Digite a nota do aluno: "); // Mensagem exibida pelo programa para gerar interatividade.
        float nota = entrada.nextFloat(); /* A variável nota é da família dos Reais, tipo primitivo float.
                                           * O objeto entrada está lendo um real do usuário usando o método nextFloat.
                                           */
        System.out.printf("A média final de %s em FUP foi %.2f\n", nome, nota); /* printf formatou a saída da string
                                                                                 * e do valor float usando duas casas decimais.
                                                                                 * No lugar de printf pode-se usar format
                                                                                 */
    }
    
}
