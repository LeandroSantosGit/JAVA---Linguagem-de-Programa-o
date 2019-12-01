
package br.com.faculdade.aula09.exception2;

/**
 * Como a exceção que pode ser lançada por f() e' do tipo "não verificada", o
 * compilador não reclama do fato de main() não informar que pode lançar uma exceção, com
 * "throws NumberFormatException" ou "throws Exception". Como nesse exemplo a exceção
 * não será lançada, o método main irá até o final.
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class TesteExc5 {

    public static void main(String[] args) {
        A teste5 = new A();
        
        int valor = 30;
        teste5.f(valor);
        
        System.out.println("Fim do métoo main do TesteExc5");
    }
    
}
