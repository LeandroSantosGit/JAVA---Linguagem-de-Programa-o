
package br.com.faculdade.aula06.associacao;

/**
 * Date 07/11/2019
 * @author Leandro
 */
public class Motor {
    private String combustivel;
    private float potencia;

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    
    public void Motor(float po, String com) {
        this.potencia = po;
        this.combustivel = com;
    }
    
    public String toString() {
        return "\nCombustivel: " + combustivel + ' ' + "\nPotencia: " + potencia + "\n";
    }
}
