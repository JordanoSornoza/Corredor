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
public class Corredor1 {
    private int energía;
    private int recarga;
    Corredor1(){}
    Corredor1(int energía, int recarga){
        this.setEnergía(energía);
        this.setRecarga(recarga);
    }
public int VerificarEnergía(){
    if (energía>=0 && energía <=100){
        this.setEnergía(energía);
        return this.getEnergía();
    }else if(energía<0){
        System.out.println("La energía del corredor está muy debajo de lo permitido");
        energía=0;
        this.setEnergía(energía);
        return this.getEnergía();
    }else{
        energía=100;
        this.setEnergía(energía);
        return this.getEnergía();
    }
}

public int RecargarEnergía(int recarga){
    System.out.println("Recarga de:");
    Scanner in = new Scanner(System.in);
    recarga = in.nextInt();
    energía = energía + recarga;
    this.setEnergía(energía);
    return this.getEnergía();
}

public int Correr(){
    energía = energía - 10;
    this.setEnergía(energía);
    return this.getEnergía();
}
 public int EnergíaAgotada(){
     if (energía<10){
        energía=0;
        this.setEnergía(energía);
        return this.getEnergía();
     } else{
        this.setEnergía(energía);
        return this.getEnergía();
     }
 }
 
 public int Entrenar(){
     if (energía>=10 && energía<=85){
      energía= energía + 15;
      this.setEnergía(energía);
      return this.getEnergía();
    }else{
      energía=100;
      this.setEnergía(energía);
      return this.getEnergía();   
     }
    }
    public void Mostrar(){
        System.out.println("La energía del corredor es:" + this.getEnergía());
    }
    
    public int getEnergía() {
        return energía;
    }

    public void setEnergía(int energía) {
        this.energía = energía;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }


}
