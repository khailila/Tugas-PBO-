/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AMD-HP-14-af119AU
 */
public class rumus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Persegi Panjang 
        persegipanjang pp1 = new persegipanjang ();
        pp1.lebar   = 4;
        pp1.panjang = 8;
        System.out.println("Luas dari Persegi panjang 1 adalah"+pp1.getLuas());
        System.out.println("Keliling dari Persegi panjang 1 adalah"+pp1.getKeliling());   
       
        // Lingkaran 
        persegipanjang circle = new persegipanjang ();
        circle.jari = 10;
        System.out.println("Luas dari lingkaran 1 adalah"+circle.getLuas1());
        System.out.println("keliling lingkaran 1 adalah"+circle.getKeliling1());
        
        // Oval
        persegipanjang oval = new persegipanjang ();
        oval.a = 6;
        oval.b = 8;
        System.out.println("Luas dari Oval 1 adalah"+oval.getLuas2());
        System.out.println("Keliling Oval 1 adalah"+oval.getKeliling2());
    }
     

} 