
package br.com.faculdade.aula09.exception3;

/**
 * Date 24/11/2019
 * @author Leandro
 */
public class Principal {

    public static void main(String[] args) {
        Funcionario fun = new Funcionario();
        double valor = 250;
        
        try {            
            fun.aumentaSalario(valor);
            System.out.println("Valor do aumento de salario R$: " + valor);
        } catch(IllegalArgumentException ex) {
            System.out.println("Valor do salario não pode ser menor que 0 e maior que 500.");
        }
        
    }
    
}
