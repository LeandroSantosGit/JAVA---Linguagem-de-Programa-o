
package br.com.faculdade.aula09.exception2;

/**
 * O compilador reclama porque a exceção que pode ser lançada por f() é do
 * tipo "verificada" (IOException), e o método main() não tem a clausula "throws IOException"
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class TesteExc7 {

    public static void main(String[] args) {
        B teste7 = new B();
        
        int valor = 40;
        teste7.f(valor);
        
        System.out.println("Fim do método main do TesteExc7");
    }
    
}
