package br.com.faculdade.aula06.encapsulamento;

/**
 * Exemplo de Encapsulamento:
 * Definir visibilidade privada do atributo, para definir o que o mundo externo a classe poderá 
 * visualizar e acessar, ultilizando o método get e set.
 * 
 * Date 07/11/2019
 * @author Leandro
 */
public class Encapsulado {

    int Privado; // restrinção máxima

    public int getPrivado() {
        return this.Privado;
    }

    public void setPrivado(int Privado) {
        this.Privado = Privado;
    }
    
}
