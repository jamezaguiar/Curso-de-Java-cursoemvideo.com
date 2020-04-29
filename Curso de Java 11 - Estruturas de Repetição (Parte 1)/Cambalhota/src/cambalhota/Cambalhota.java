package cambalhota;

public class Cambalhota {
    
    public static void main(String[] args) {
        int cc = 0;
        
        while (cc<10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue; // O comando continue ignora a próxima repetição e volta para a condição do laço
            }
            if (cc == 7) {
                break; // O comando break ignora a condição e joga o programa pra fora do laço
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
