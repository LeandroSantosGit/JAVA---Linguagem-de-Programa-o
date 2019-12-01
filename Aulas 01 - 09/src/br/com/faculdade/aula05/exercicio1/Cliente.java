
package br.com.faculdade.aula05.exercicio1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Date 20/10/2019
 * @author Leandro
 */
public class Cliente extends JFrame{
    private String nome;
    private int numConta;
    private JLabel labNome = new JLabel("Nome: ");
    private JLabel labNumConta = new JLabel("Num. Conta");
    private JTextField textNome = new JTextField(20);
    private JTextField textNumConta = new JTextField(10);
    private JButton btnOk = new JButton("Criar Objeto");
    
    public Cliente() {
        super("Cadastro Cliente");
        setLayout(new FlowLayout());
        
        add(labNome); add(textNome);        
        add(labNumConta); add(textNumConta);
        add(btnOk);
        
        TrataBotao tratamentoBtn = new TrataBotao();
        btnOk.addActionListener(tratamentoBtn);
    }

    private Cliente(String n, int conta) {
        nome = n;
        numConta = conta;
    }    
    
    private class TrataBotao implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            
            nome = textNome.getText();
            numConta = Integer.parseInt(textNumConta.getText());
            Cliente novo = new Cliente(nome, numConta);
            
            JOptionPane.showMessageDialog(null, novo);
        }
    }
}
