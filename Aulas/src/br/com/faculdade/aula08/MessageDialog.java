
package br.com.faculdade.aula08;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Date 23/11/2019
 * @author Leandro
 */
public class MessageDialog {
    private static Component janela;
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(janela, "Prepare-se as provas estão chegando!", 
                "Linguagem de Programação", JOptionPane.WARNING_MESSAGE);
    }
}
