
package br.com.faculdade.aula05.exercicio2;

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
public class ClienteOuro extends JFrame{
    private String nome;
    private int numConta;
    private double limite;
            
    private JLabel labNome = new JLabel("Nome: ");
    private JLabel labNumConta = new JLabel("Num. Conta");
    private JLabel labLimite = new JLabel("Limite");
    private JTextField textNome = new JTextField(20);
    private JTextField textNumConta = new JTextField(10);
    private JTextField textLimite = new JTextField(10);
    private JButton btnOk = new JButton("Criar Objeto");
    
    public ClienteOuro() {
        super("Cadastro do cliente Ouro");
        setLayout(new FlowLayout());
        
        add(labNome);
        add(textNome);
        add(labNumConta);
        add(textNumConta);
        add(labLimite);
        add(textLimite);
        add(btnOk);
        
        TrataBotao tratamentBtn = new TrataBotao();
        btnOk.addActionListener(tratamentBtn);
    }

    private ClienteOuro(String n, int conta, double limit) {
        nome = n;
        numConta = conta;
        limite = limit;
    }
    
    private class TrataBotao implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            ClienteOuro novo;
            
            nome = textNome.getText();
            numConta = Integer.parseInt(textNumConta.getText());
            limite = Double.parseDouble(textLimite.getText());
            
            novo = new ClienteOuro(nome, numConta, limite);
            
            JOptionPane.showMessageDialog(null, novo);
        }
    }
}
