
package br.com.faculdade.aula04;

/**
 * Criar classe com atributos e métodos básicos de bicicleta.
 * 
 * Date 22/09/2019
 * @author Leandro
 */
public class Bicicleta {
    private int ano;
    private String modelo;
    private String marca;
    private float velocidade;
    private int numeroMarcha;

    public Bicicleta(int ano, String modelo, String marca, float velocidade, int numeroMarcha) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade = velocidade;
        this.numeroMarcha = numeroMarcha;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroMarcha() {
        return numeroMarcha;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumeroMarcha(int numeroMarcha) {
        this.numeroMarcha = numeroMarcha;
    }
   
    public void acelerar(int aumenta) {
        velocidade += aumenta;
    }
    
    public void acionarFreio(int diminui) {
        velocidade -= diminui;
    }
}
