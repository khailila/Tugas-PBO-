/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMD-HP-14-af119AU
 */
public class persegipanjang {
    //atribut 
    public int lebar;
    public int panjang;
    public double phi = 3.14;
    public double jari;
    public double a;
    public double b;
    //method 
    public int getLuas(){
        return this.lebar*this.panjang;
    }
    
    public int getKeliling(){
        return this.lebar*2+this.panjang*2;
}
    public double getLuas1(){
        return this.phi*this.jari*this.jari;
    }
    public double getKeliling1(){
        return this.jari*2*this.phi;
    }
    
    public double getLuas2  (){
        return this.phi*this.a*this.b;
    }
    public double getKeliling2 (){
        return this.a+this.b*this.phi;
    }
}
