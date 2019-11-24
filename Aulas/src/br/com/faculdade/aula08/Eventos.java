
package br.com.faculdade.aula08;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Programa para criar numero aleatório, e tratando eventos na propria classe.
 * 
 * Date 23/11/2019
 * @author Leandro
 */
public class Eventos extends JFrame implements ActionListener {
    private JTextField texto;
    private JButton btnCriar, btnApagar;
    private Random gerador;
    
    public static void main(String[] args) {
        Eventos eventos = new Eventos("Tratamento de eventos na propria classe.");
        eventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventos.setSize(600, 80);
        eventos.setVisible(true);
    }
    
    public Eventos(String titulo) {
        super(titulo);
        gerador = new Random();
        adicionarComponentes();
        pack();
    }
    
    private void adicionarComponentes() {
         JPanel painelPrincipal = new JPanel();
         
         JLabel label = new JLabel("Gerar número aleatorio: ");
         painelPrincipal.add(label);
         
         texto = new JTextField(20);
         texto.setEditable(false);
         painelPrincipal.add(texto);
         
         btnCriar = new JButton("Gerar");
         painelPrincipal.add(btnCriar);
         btnApagar = new JButton("Limpar");
         painelPrincipal.add(btnApagar);
         
         getContentPane().add(painelPrincipal, BorderLayout.CENTER);
         
         btnCriar.addActionListener(this);
         btnApagar.addActionListener(this);   
    }
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnCriar) {
            texto.setText(String.valueOf(gerador.nextInt()));
        } 
        if (event.getSource() == btnApagar) {
            texto.setText("");
        }
    }
}
