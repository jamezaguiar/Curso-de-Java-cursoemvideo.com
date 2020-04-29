// Como converter int para string e vice-versa
package converterintparastring;

/**
 * @author Jamerson Aguiar
 */
public class ConverterIntParaString {

    public static void main(String[] args) {
        // int para string
        int idade = 30; // Variável de tipo primitivo int recebe valor 30
        String valor = Integer.toString(idade); /* Usando a classe invólucro String declaro a variável valor que recebe
                                                 * a classe invólucro Integer com o método toString, convertendo o 30 da
                                                 * variável idade de int para string.
                                                 */
        System.out.println(valor); // print da string valor
        
        // string para int
        String text = "40"; // Variável de classe invólucro String recebe o texto 40
        int num = Integer.parseInt(text);/* Usando o tipo primitivo int declaro a variável num que recebe
                                          * a classe invólucro Integer com o método parseInt, convertendo o 40 da
                                          * variável text de string para int.
                                          */
        System.out.println(num); // print do int num
        // o código acima também converte string para float usando float num = Float.parseFloat(text)
    }
    
}
