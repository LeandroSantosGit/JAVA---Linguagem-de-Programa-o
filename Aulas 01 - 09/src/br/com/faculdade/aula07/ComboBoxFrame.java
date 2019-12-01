
package br.com.faculdade.aula07;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Date 17/11/2019
 * @author Leandro
 */
public class ComboBoxFrame extends JFrame {
    private JComboBox<String> comboBox;
    private JLabel label;
    
    private static final String[] itens = {"Item 1", "Item 2", "Item 3", "Item 4"};
    
    public ComboBoxFrame() {
        super("JComboBox");
        setLayout(new FlowLayout());
        
        comboBox = new JComboBox<>(itens);
        comboBox.setMaximumRowCount(3);
        
        comboBox.addItemListener((ItemEvent event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                label.setText(comboBox.getSelectedItem().toString());
            }
        });
        
        add(comboBox);
        label = new JLabel("Testando");
        add(label);
    }
    
    public static void main(String[] args) {
        ComboBoxFrame janela = new ComboBoxFrame();
        janela.setSize(300, 200);
        janela.setVisible(true);
    }
    
}
