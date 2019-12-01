
package br.com.faculdade.aula09.exception2;

/**
 * O bloco catch não existe. Portanto, a exceção não será capturada,
 * gerando um stack trace. O bloco finally e' executado, mas não o que segue depois.
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class TesteExc2 {

    public static void main(String[] args) {
        try {
            A teste2 = new A();
            
            int valor = 10;
            teste2.f(valor);
        } finally {
            System.out.println("Fim do bloco try do TesteExc2");
        }
        System.out.println("Fim do método main do TesteExc2");
    }
    
}
