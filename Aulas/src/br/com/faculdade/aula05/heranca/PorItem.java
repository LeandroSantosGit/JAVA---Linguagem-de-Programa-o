
package br.com.faculdade.aula05.heranca;

/**
 * Salário por produção multiplicado pela quantidade produzida
 * 
 * Date 20/10/2019
 * @author Leandro
 */
public final class PorItem extends Empregado{
    private double producao;
    private int quantidade;
    
    public PorItem(String n, String f, double p, int q) {
        super(n, f);
        setProducao(p);
        setQuantidade(q);
    }
    
    public void setProducao(double p) {
        producao = (p > 0 ? p : 0.0);
    }
    
    public void setQuantidade(int q) {
        quantidade = (q > 0 ? q : 0);
    }
    
    public String toString() {
        return "Por Item: " + super.toString();
    }
    
    public double ganha() {
        return producao * quantidade;
    }
}
