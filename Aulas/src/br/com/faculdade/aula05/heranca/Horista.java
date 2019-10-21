
package br.com.faculdade.aula05.heranca;

/**
 * Salário por hora multiplicado por horas trabalhadas, no máximo 300 horas 
 * 
 * Date 20/10/2019
 * @author Leandro
 */
public final class Horista extends Empregado{
    private double valor;
    private double horas;
    
    public Horista(String n, String f, double v, double h) {
        super(n, f);
        setValor(v);
        setHoras(h);
    }
    
    public void setValor(double v) {
        valor = (v > 0 ? v : 0.0);
    }
    
    public void setHoras(double h) {
        horas = (h >= 0 && h <= 300 ? h : 0.0);
    }
    
    public String toString() {
        return "Horista: " + super.toString();
    }
    
    public double ganha() {
        return valor * horas;
    }
}
