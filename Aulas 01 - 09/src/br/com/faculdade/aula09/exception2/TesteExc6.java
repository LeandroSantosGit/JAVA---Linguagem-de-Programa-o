
package br.com.faculdade.aula09.exception2;

import java.io.IOException;

/**
 * Usa-se a informação contida no objeto exceção para gerar a mensagem
 * de erro, pois o método f() da classe B cria exceções com uma mensagem informativa.
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class TesteExc6 {

    public static void main(String[] args) {
        try {
            B teste5 = new B();
            
            int valor = 10;
            teste5.f(valor);
        } catch(IOException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Fim do bloco try do TesteExc5");
        }
        System.out.println("Fim do método main do TesteExc5");
    }
    
}
