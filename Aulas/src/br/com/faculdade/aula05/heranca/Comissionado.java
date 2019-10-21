
package br.com.faculdade.aula05.heranca;

/**
 * Salário fixo, mais a comissão de item vendido e multiplicado pelo número de itens vendidos
 * 
 * Date 20/10/2019
 * @author Leandro
 */
public final class Comissionado extends Empregado{
    private double salario;
    private double comissao;
    private int vendas;
    
    public Comissionado(String n, String f, double s, double c, int v) {
        super(n, f);
        setSalario(s);
        setComissao(c);
        setVendas(v);
    }
    
    public void setSalario(double s) {
        salario = (s > 0 ? s : 0.0);
    }
    
    public void setComissao(double c) {
        comissao = (c > 0 ? c : 0.0);
    }
    
    public void setVendas(int v) {
        vendas = (v > 0 ? v : 0);
    }
    
    public String toString() {
        return "Comissionado: " + super.toString();
    }
    
    public double ganha() {
        return salario + comissao * vendas;
    }
}
