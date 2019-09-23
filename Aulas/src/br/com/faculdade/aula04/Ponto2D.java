/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faculdade.aula04;

/**
 * Exercicio 1
 * Criar classe para calcular do ponto cartesiano de x e y.
 * 
 * Date 22/09/2019
 * @author Leandro
 */
public class Ponto2D {
    private int x;
    private int y;
    
    public Ponto2D(int a, int b) {
        this.x = a;
        this.y = b;
    }
    
    public double distancia(Ponto2D p) {
        double distancX = p.x - x;
        double distancY = p.y - y;
        
        return Math.sqrt((distancX * distancX) + (distancY * distancY));
    }
}
