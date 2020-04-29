// Programa que exibe o idioma do sistema do usuário
package idiomadosistema;

import java.util.*;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema está em ");
        System.out.println (loc.getDisplayLanguage()); // imprime o idioma do sistema
    }
    
}
