package comparandostrings;

public class ComparandoStrings {
    
    public static void main(String[] args) {
        String nome1 = "Jamerson";
        String nome2 = "Jamerson";
        String nome3 = new String("Jamerson");
        String comparação1com2;
        String comparação1com3;
        String comparaçãoobjeto;
        
        
        comparação1com2 = (nome1==nome2)?"Iguais":"Diferentes";
        comparação1com3 = (nome1==nome3)?"Iguais":"Diferentes";
        System.out.println(comparação1com2);
        System.out.println(comparação1com3);
        
        comparaçãoobjeto = (nome1.equals(nome3))?"Iguais":"Diferentes";
        System.out.println(comparaçãoobjeto);
    }
    
}
