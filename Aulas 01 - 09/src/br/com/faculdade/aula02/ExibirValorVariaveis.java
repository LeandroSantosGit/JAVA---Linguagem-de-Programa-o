
package br.com.faculdade.aula02;

/**
 * Exercício 1
 * Apresente valor da variável d
 * Apresente o conteúdo da variável c
 * Apresente o soma inteira de i e d
 * Apresente o conteúdo da variável b
 * Apresente o texto "positivo" caso a variável b seja true e "falso" caso contrário
 * 
 * Date    05/09/2019
 * @author Leandro              
 */
public class ExibirValorVariaveis {
    
    public static void main(String[] args) {
        int i = 10;
        double d = 9.85;
        char c = 'a';
        boolean b = true;
        
        System.out.println("\nValor da variável d: " + d);
        System.out.println("\nConteúdo da variável c: " + c);
        System.out.println("\nSoma da variável i e d: " + (i + (int)d) );
        System.out.println("\nConteúdo da variável b: " + b);
        System.out.println("\nValor da variável i = " + i);
        
        if (b == true) {
            System.out.println("\nPositivo");
        } else {
            System.out.println("\nFalso");
        }
    }
}
