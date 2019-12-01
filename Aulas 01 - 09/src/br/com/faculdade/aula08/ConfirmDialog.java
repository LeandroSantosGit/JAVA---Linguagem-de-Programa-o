
package br.com.faculdade.aula08;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Date 23/11/2019
 * @author Leandro
 */
public class ConfirmDialog {
    private static Component janela;
    
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(janela, 
                "Tem certeza que deseja excluir este arquivo?", "Excluir arquivo", JOptionPane.OK_CANCEL_OPTION);
    }
    
}
