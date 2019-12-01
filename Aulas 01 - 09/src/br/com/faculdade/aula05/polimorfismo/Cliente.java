
package br.com.faculdade.aula05.polimorfismo;

/**
 * Date 20/10/2019
 * @author Leandro
 */
public class Cliente {
    private String nome;
    private int numberConta;
    
    public Cliente(String n) {
        this(n, 0);
    }
    
    public Cliente(String n, int conta) {
        nome = n;
        numberConta = conta;
    }
    
    public int getNumberConta() {
        return numberConta;
    }
    
    public void setNumberConta(int numero) {
        numberConta = numero;
    }
    
    public String toString() {
        return "Nome: " + nome + ' ' + "Conta: " + numberConta;
    }
}
