
package br.com.faculdade.aula08.trataeventolocal;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Programa para criar numero aleatório, trata eventos local.
 * 
 * Date 23/11/2019
 * @author Leandro
 */
public class Eventos extends JFrame {
    static final String LIMPAR = "Limpar";
    static final String GERAR = "Gerar";
    private JTextField texto;
    private JButton btnGerar, btnLimpar;
       
    public Eventos(String titulo) {
        super(titulo);
        adcionarComponentes();
        pack();
    }
    
    private void adcionarComponentes() {
        JPanel painelPrincipal = new JPanel();
        
        JLabel label = new JLabel("Gerar número aleatório");
        painelPrincipal.add(label);
        
        texto = new JTextField(20);
        texto.setEditable(false);
        painelPrincipal.add(texto);
        
        btnGerar = new JButton("Gerar");
        btnGerar.setActionCommand(GERAR);
        painelPrincipal.add(btnGerar);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.setActionCommand(LIMPAR);
        painelPrincipal.add(btnLimpar);
        
        getContentPane().add(painelPrincipal, BorderLayout.CENTER);
        
        TrataEvento listener = new TrataEvento(texto);
        btnGerar.addActionListener(listener);
        btnLimpar.addActionListener(listener);
    }
    
    public static void main(String[] args) {
        Eventos eventos = new Eventos("Tratamento de eventos numa calsse local");
        eventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventos.setSize(600, 80);
        eventos.setVisible(true);
    }
}
