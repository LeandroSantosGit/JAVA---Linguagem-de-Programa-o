
package br.com.faculdade.aula08;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Date 23/11/2019
 * @author Leandro
 */
public class InputDialog {
    private static Component janela;
    
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(janela, 
                "Digite seu nome", "Linguagem de Programação", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(janela, text, 
                "Linguagem de Programação", JOptionPane.WARNING_MESSAGE);
    }
    
}
