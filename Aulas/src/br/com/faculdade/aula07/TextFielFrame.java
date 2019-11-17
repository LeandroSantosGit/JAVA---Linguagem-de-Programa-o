
package br.com.faculdade.aula07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Date 17/11/2019
 * @author Leandro
 */
public class TextFielFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
    
    public TextFielFrame() {
        super("JtexteFiled e JPassword");
        setLayout(new FlowLayout());
        
        textField1 = new JTextField(10);
        add(textField1);
        
        textField2 = new JTextField("Digite aqui o texto");
        add(textField2);
        
        textField3 = new JTextField("TextField não digitavél", 21);
        textField3.setEditable(false);
        add(textField3);
        
        passwordField = new JPasswordField("Texto oculto");
        add(passwordField);
        
        TextFieldHandler trata = new TextFieldHandler();
        textField1.addActionListener(trata);
        textField2.addActionListener(trata);
        textField3.addActionListener(trata);
        passwordField.addActionListener(trata);
    }    
    
    private class TextFieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            String string = "";
            
            if (evento.getSource() == textField1) {
                string = String.format("textField1: %s", evento.getActionCommand());
            } else if (evento.getSource() == textField2) {
                string = String.format("textFild2: $s", evento.getActionCommand());
            } else if (evento.getSource() == textField3) {
                string = String.format("textFiled3: %s", evento.getActionCommand());
            } else if (evento.getSource() == passwordField) {
                string = String.format("passwordField: %s", evento.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, string);
        }
    }
    
    public static void main(String[] args) {
        TextFielFrame janela = new TextFielFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(380, 200);
        janela.setVisible(true);
    }
    
}
