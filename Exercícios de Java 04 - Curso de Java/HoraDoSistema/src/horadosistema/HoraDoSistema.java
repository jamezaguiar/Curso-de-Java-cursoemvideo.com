// Programa que exibe a hora atual do sistema
package horadosistema; // Pacote

import java.util.Date; // Importação da classe Date

public class HoraDoSistema { // Classe
    public static void main(String[] args) { // Método principal
        Date relogio = new Date();
        System.out.print("A hora do sistema é "); // Print da mensagem
        System.out.println(relogio.toString()); // Print da data
    }
}