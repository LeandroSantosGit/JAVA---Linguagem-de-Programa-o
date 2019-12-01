
package br.com.faculdade.aula09.exception2;

/**
 * O bloco catch não existe, apenas o try e o finally. Com esse valor de a, a
 * exceção não será lançada. Nesse caso, o código depois do bloco finally também será
 * executado
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class TesteExc3 {

    public static void main(String[] args) {
        try {
            A teste3 = new A();
            
            int valor = 25;
            teste3.f(valor);
        } finally {
            System.out.println("Fim do bloco try do TesteExc3");
        }
        System.out.println("Fim do método main do TesteExc3");
    }
    
}
