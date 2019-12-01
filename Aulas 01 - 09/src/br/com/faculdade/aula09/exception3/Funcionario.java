
package br.com.faculdade.aula09.exception3;

/**
 * Date 24/11/2019
 * @author Leandro
 */
public class Funcionario {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }      
    
    public void aumentaSalario(double aumento) {
        if (aumento < 0 || aumento > 500) {
            IllegalArgumentException erroAumento = new IllegalArgumentException();
            throw erroAumento;
        }
    }   
    
}
