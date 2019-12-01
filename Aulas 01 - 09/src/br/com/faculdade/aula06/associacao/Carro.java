
package br.com.faculdade.aula06.associacao;

/**
 * Date 07/11/2019
 * @author Leandro
 */
public class Carro {
    private String modelo;
    private int ano;
    private Motor motor; // associação
    
    public void Carro(int a, String mod, Motor m) {
        this.ano = a;
        this.modelo = mod;
        this.motor = m;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public String toString() {
        return "Modelo: " + modelo + ' ' + "\nAno: " + ano;
    }
}
