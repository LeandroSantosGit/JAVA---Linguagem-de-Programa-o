
package br.com.faculdade.aula06.associacao;

/**
 * Date 07/11/2019
 * @author Leandro
 */
public class Principal {

    public static void main(String[] args) {     
        String imprimir = "";
        
        Motor motAP = new Motor();
        Carro fusca = new Carro();
        
        motAP.setCombustivel("Gasolina");
        motAP.setPotencia((float) 1.6);
        fusca.setModelo("Fusca");
        fusca.setAno(1982);
        
        imprimir = fusca.toString() + " " + motAP.toString();
        
        System.out.println(imprimir);
        
        motAP.setCombustivel("fex");
        motAP.setPotencia((float) 1.4);
        fusca.setModelo("Uno");
        fusca.setAno(2017);
        
        imprimir = fusca.toString() + " " + motAP.toString();
        
        System.out.println(imprimir);
    }
    
}
