
package trabalhoexploratorio;

import trabalhoexploratorio.telas.MenuInicial;


/**  TRABALHO EXPLORATORIO DE PROGRAMÇÃO ORIENTADA A OBJETOS - 2022/10
 *
 * @author José Samuel Pereira                 - Ra: 22016916-2 - Pura Fome
 * @author Karla duarte Ferreira               - Ra: 21144154-2
 * @author Eduardo Richard da Silva Nascimento - Ra: 21161812-2 - richwrd
 */


public class TrabalhoExploratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // iniciando tela menu principal do joptionframe
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
        
    }
    
}
