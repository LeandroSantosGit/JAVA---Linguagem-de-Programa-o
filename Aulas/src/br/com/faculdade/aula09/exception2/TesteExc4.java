
package br.com.faculdade.aula09.exception2;

/**
 * Como a exceção que pode ser lançada por f() não é verificada, o
 * compilador não reclama por não haver a cláusula throws no cabeçalho de main. Mas a
 * exceção será lançada, originando um stack trace, e o método main() não continuará após o
 * ponto da chamada de f().
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class TesteExc4 {

    public static void main(String[] args) {
        A teste4 = new A();
            
        int valor = 5;
        teste4.f(valor);
            
        System.out.println("Fim do método main do TesteExc4");
    }
    
}
