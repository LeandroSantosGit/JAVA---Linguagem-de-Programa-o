
package br.com.faculdade.aula09.exception2;

import java.io.IOException;

/**
 * Como IOException é uma exceção verificada, o compilador exige que o
 * método f() declare explicitamente que pode lançar a exceção, colocando a frase "throws
 * IOException" no seu cabeçalho.
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class B {
    public void f(int a) throws IOException {
        if (a < 20) throw new IOException("Valor do argumento de f() é " + a + " (mnenor que 20)");
            System.out.println("a = " + a);
    }
}
