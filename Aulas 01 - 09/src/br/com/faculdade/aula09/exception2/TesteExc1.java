
package br.com.faculdade.aula09.exception2;

/**
 * A exceção será capturada, e as três mensagens serão exibidas. Ou seja,
 * mesmo depois de finally executar, o restante do método main continua.
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class TesteExc1 {

    public static void main(String[] args) {
        try {
            A teste1 = new A();
            
            int valor = 15;
            teste1.f(valor);
        } catch(Exception e) {
            System.out.println("Valor ilegal de TesteExc1");
        } finally {
            System.out.println("Fim do bloco try em TesteExc1");
        }
        System.out.println("Fim do método main do TesteExc1");
    }
    
}
