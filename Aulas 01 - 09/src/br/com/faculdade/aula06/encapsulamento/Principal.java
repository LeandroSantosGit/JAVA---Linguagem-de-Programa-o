

package br.com.faculdade.aula06.encapsulamento;

/**
 * Exemplo de Encapsulamento
 * 
 * Date 07/11/2019
 * @author Leandro
 */
public class Principal {


    public static void main(String[] args) {
        Encapsulado en = new Encapsulado();
        
        en.setPrivado(20); // acessar o atributo de forma indireta
        
        System.out.println("Valor da variável privado: " + en.getPrivado());
    }
    
}
