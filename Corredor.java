/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corredor;

import java.util.Scanner;

/**
 *
 * @author PC-Admin
 */
public class Corredor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Corredor1 cor = new Corredor1();
        System.out.println("Ingrese energía del corredor");
        Scanner in = new Scanner(System.in);
        int energía = in.nextInt();
        cor.setEnergía(energía);
        
        cor.VerificarEnergía();
        cor.Mostrar();
        cor.Correr();
        cor.Mostrar();
        cor.Correr();
        cor.Mostrar();
        cor.EnergíaAgotada();
        cor.Mostrar();
        cor.RecargarEnergía(energía);
        cor.Mostrar();
        cor.Correr();
        cor.Mostrar();
        cor.Correr();
        cor.Mostrar();
        cor.EnergíaAgotada();
        cor.Mostrar();
        cor.Entrenar();
        cor.Entrenar();
        cor.Mostrar();
    }
    
}
