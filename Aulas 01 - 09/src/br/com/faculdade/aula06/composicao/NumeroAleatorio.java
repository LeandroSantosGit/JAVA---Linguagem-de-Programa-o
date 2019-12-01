
package br.com.faculdade.aula06.composicao;

/**
 * Exemplo de composição:
 * Tipo de associação onde uma nova classe usa classes existentes como atributos.
 * 
 * Date 07/11/2019
 * @author Leandro
 */
public class NumeroAleatorio {
    private String nome;
    private Randomico valor;
    
    NumeroAleatorio(String nome, int valor) {
        this.nome = nome;
        this.valor = new Randomico(valor);
    }
}
