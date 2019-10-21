
package br.com.faculdade.aula05.polimorfismo;

/**
 * Date 20/10/2019
 * @author Leandro
 */
public class ClienteOuro extends Cliente{
    private double limiteChequeEspecial;
    
    public ClienteOuro(String nome, int conta, double limite) {
        super(nome, conta);
        limiteChequeEspecial = limite;
    }
    
    public String toString() {
        return super.toString();
    }

}
