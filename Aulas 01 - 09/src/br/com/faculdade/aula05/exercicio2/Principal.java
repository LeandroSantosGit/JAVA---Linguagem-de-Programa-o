
package br.com.faculdade.aula05.exercicio2;

import javax.swing.JFrame;

/**
 * Faça um programa com uma interface gráfica para criar o objeto ClienteOuro
 * 
 * Date 20/10/2019
 * @author Leandro
 */
public class Principal {

    public static void main(String[] args) {
        ClienteOuro janela = new ClienteOuro();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(675, 180);
        janela.setVisible(true);
    }
    
}
