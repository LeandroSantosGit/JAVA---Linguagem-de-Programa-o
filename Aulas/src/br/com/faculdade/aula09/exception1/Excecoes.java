
package br.com.faculdade.aula09.exception1;

/**
 * Date 24/11/2019
 * @author Leandro
 */
public class Excecoes {
    public int valor;
    
    public Excecoes(int n) {
        valor = n;
    }
    
    public void verificarValor(int x) throws Exception, NumberFormatException, ArithmeticException {
        if (x < 0)
            throw new NumberFormatException("Erro - Valor negativo: " + x);
        if (x <= valor)
            throw new NumberFormatException("Erro - Valor deve ser maior que: " + valor);
        if (x > 10000) 
            throw new Exception("Erro-Argumento muito grande: "+ x);
            System.out.println (x / (valor-100)); 
    }
}
