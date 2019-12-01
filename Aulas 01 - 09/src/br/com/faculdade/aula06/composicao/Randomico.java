
package br.com.faculdade.aula06.composicao;

import java.util.Random;

/**
 * Exemplo de composição:
 * Tipo de associação onde uma nova classe usa classes existentes como atributos.
 * 
 * Date 07/11/2019
 * @author Leandro
 */
public class Randomico {
    int numero;
    
    Randomico(int maximo) {
        numero = new Random().nextInt(maximo);
                
    }
}
