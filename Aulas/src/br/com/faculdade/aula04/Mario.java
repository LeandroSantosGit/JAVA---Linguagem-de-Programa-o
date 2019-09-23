
package br.com.faculdade.aula04;

/**
 * Criar classe do jogo Mario com atributos e métodos.
 * 
 * Date 22/09/2019
 * @author Leandro
 */
public class Mario {
    private int vidas;
    private int velocidade;
    private String tamanho;
    
    public void parar() {
        velocidade = 0;
    }
    
    public void correr() {
        velocidade += velocidade;
    }
    
    public void diminuir() {
        if (tamanho.equals("Grande")) {
            tamanho = "Normal";
        } else {
            tamanho = "Pequeno";
        }
    }
    
    public void crecer() {
        if (tamanho.equals("Pequeno")) {
            tamanho = "Normal";
        } else {
            tamanho = "Grande";
        }
    }
    
    
}
