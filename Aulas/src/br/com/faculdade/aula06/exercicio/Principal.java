
package br.com.faculdade.aula06.exercicio;

import javax.swing.JOptionPane;

/**
 * Date 08/11/2019
 * @author Leandro
 */
public class Principal {

    public static void main(String[] args) {
        Automovel carro = new Automovel("Celta", "Preto", 2015, true);
        JOptionPane.showMessageDialog(null, carro);
        carro.desligarMotor();
        JOptionPane.showMessageDialog(null, carro);
        
        carro.setModelo("Fusion");
        carro.setCor("Branco");
        carro.setAno(2019);
        carro.ligarMotor();
        JOptionPane.showMessageDialog(null, carro);
    }
    
}
