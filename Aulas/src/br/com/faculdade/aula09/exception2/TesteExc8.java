
package br.com.faculdade.aula09.exception2;

import java.io.IOException;

/**
 * A exceção que pode ser lançada por f() e' verificada (IOException), e o
 * método main() tem a clausula "throws IOException", compilando OK.
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class TesteExc8 {

    public static void main(String[] args) throws IOException {
        B teste8 = new B();
        
        int valor = 5;
        teste8.f(valor);
        
        System.out.println("Fim do método main do TesteExc8");
    }
    
}
