
package br.com.faculdade.aula07;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Date 17/11/2019
 * @author Leandro
 */
public class CheckBoxFrame extends JFrame {
    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italJCheckBox;
    
    public CheckBoxFrame() {
        super("JCheckBox");
        setLayout(new FlowLayout());
        
        textField = new JTextField("A letra vai mudar", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);
        
        boldJCheckBox = new JCheckBox("Bold");
        italJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox);
        add(italJCheckBox);
        
        CheBoxHandler trata = new CheBoxHandler();
        boldJCheckBox.addItemListener(trata);
        italJCheckBox.addItemListener(trata);
    }
    
    private class CheBoxHandler implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            
            if (boldJCheckBox.isSelected() && italJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);                
            } else if (boldJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (italJCheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }
            textField.setFont(font);
        }
    }
    
    public static void main(String[] args) {
        CheckBoxFrame janela = new CheckBoxFrame();
        janela.setSize(280, 150);
        janela.setVisible(true);
    }
    
}
