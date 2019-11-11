
package br.com.faculdade.aula06.exercicio;

/**
 * Crie classe Automovel.java com os atributos 'modelo', 'cor' e 'ano', encapsule seus métodos e crie 
 * mecanismos públicos para acessar estas características:
 * Crie mais um atributo na classe do tipo boolean – estadoMotor.
 * Crie métodos ligarMotor() e desligarMotor(), atualizando o valor de estadoMotor. 
 * Crie uma classe de teste para instanciar Automóvel.
 * 
 * Date 08/11/2019
 * @author Leandro
 */
public class Automovel {
    private String modelo;
    private String cor;
    private int ano;
    private boolean estadoMotor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEstadoMotor() {
        return estadoMotor;
    }

    public void setEstadoMotor(boolean estadoMotor) {
        this.estadoMotor = estadoMotor;
    }
    
    public Automovel(String modelo, String cor, int ano, boolean estadoMotor) {
        super();
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.estadoMotor = estadoMotor;
    }
    
    public void ligarMotor() {
        this.estadoMotor = true;
    }
    
    public void desligarMotor() {
        this.estadoMotor = false;
    }
    
    public String toString() {
        return "Automovel: \n\nModelo: " + modelo + "\nCor: " + cor + "\nAno: " + ano + "\nMotor ligado: " + estadoMotor;
    }
}
