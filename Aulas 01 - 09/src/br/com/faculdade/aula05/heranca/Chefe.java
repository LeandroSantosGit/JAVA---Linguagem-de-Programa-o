
package br.com.faculdade.aula05.heranca;

/**
 * Salário do chefe fixo predefinido
 * 
 * Date 20/10/2019
 * @author Leandro
 */
public final class Chefe extends Empregado{
    private double salario;
    
    public Chefe(String n, String f, double s) {
        super(n, f);
        setSalario(s);
    }
    
    public void setSalario(double s) {
        salario = (s > 0 ? s : 0.0);
    }
    
    public String toString() {
        return "Chefe: " + super.toString();
    }
    
    public double ganha() {
        return salario;
    }
}
