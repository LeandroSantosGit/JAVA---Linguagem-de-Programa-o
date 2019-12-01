
package br.com.faculdade.aula08.trataeventolocal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JTextField;

/**
 * Programa para criar numero aleatório, trata eventos local.
 * 
 * Date 23/11/2019
 * @author Leandro
 */
public class TrataEvento implements ActionListener {
    private JTextField texto;
    private Random gerador;

    public TrataEvento(JTextField texto) {
        this.texto = texto;
        gerador = new Random();
    }
    
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals(Eventos.GERAR)) {
            texto.setText(String.valueOf(gerador.nextInt()));
        }
        if (event.getActionCommand().equals(Eventos.LIMPAR)) {
            texto.setText("");
        }
    }
}
