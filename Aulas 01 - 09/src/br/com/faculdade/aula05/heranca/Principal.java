/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faculdade.aula05.heranca;

import java.text.DecimalFormat;

/**
 * Date 20/10/2019
 * @author Leandro
 */
public class Principal {

    public static void main(String[] args) {
        Empregado emp;
        String sai = "";
        DecimalFormat df = new DecimalFormat("0.00");
        
        Chefe lider = new Chefe("Leandro", "Santos", 3000.00);
        Comissionado comisao = new Comissionado("Clara", "Souza", 400.00, 4.00, 150);
        PorItem item = new PorItem("Jose", "Silva", 3.50, 250);
        Horista hora = new Horista("Nilza", "Ferreira", 15.75, 300.00);
        
        emp = lider;
        sai += emp.toString() + " ganha $" + df.format(emp.ganha()) + "\n";
        
        emp = comisao;
        sai += emp.toString() + " ganha $" + df.format(emp.ganha()) + "\n";
        
        emp = item;
        sai += emp.toString() + " ganha $" + df.format(emp.ganha()) + "\n";
        
        emp = hora;
        sai += emp.toString() + " ganha $" + df.format(emp.ganha()) + "\n";
        
        System.out.println(sai);
    }
    
}
