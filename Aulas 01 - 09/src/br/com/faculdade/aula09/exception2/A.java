
package br.com.faculdade.aula09.exception2;

/**
 * A classe A tem um metodo f() que pode lançar uma exceção do tipo
 * NumberFormatException, que nao é verificada. Por esse motivo, o método f() não precisa
 * incluir a terminação "throws NumberFormatException". 
 * 
 * Date 24/11/2019
 * @author Leandro
 */
public class A {
   public void f(int a) {
       if (a < 20) throw new NumberFormatException();
            System.out.println("A = " + a);
   }
}
