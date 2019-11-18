
package br.com.faculdade.aula07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Date 17/11/2019
 * @author Leandro
 */
public class ButtonFrame extends JFrame {
    private JButton button1;
    private JButton button2;
    
    public ButtonFrame() {
        super("Botões");
        setLayout(new FlowLayout());
        
        button1 = new JButton("Botão Simples");
        add(button1);
        
        Icon img = new ImageIcon(getClass().getResource("img.png"));
        button2 = new JButton("Botão com imagem", img);
        add(button2);
        
        ButtonHandler trata = new ButtonHandler();
        button1.addActionListener(trata);
        button2.addActionListener(trata);
    }
    
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Você apertou o: %s", event.getActionCommand()));
        }
    }
    

    public static void main(String[] args) {
        ButtonFrame janela = new ButtonFrame();
        janela.setSize(280, 150);
        janela.setVisible(true);
    }
    
}
