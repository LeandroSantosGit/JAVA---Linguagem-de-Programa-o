
package br.com.faculdade.aula09.exception1;

/**
 * Date 24/11/2019
 * @author Leandro
 */
public class Principal {

    public static void main(String[] args) {
        Excecoes ex = new Excecoes(100);
        
        try {
            //ex.verificarValor(200);
            ex.verificarValor(-20);
            //ex.verificarValor(200000);
            //ex.verificarValor(700);
        } catch(NumberFormatException num) {
            System.out.println(num);
        } catch (ArithmeticException ar) {
            System.out.println(ar);
        } catch (Exception excecao) {
            System.out.println(excecao);
        } finally {
            System.out.println("Terminou o método");
        }
    }    
}
