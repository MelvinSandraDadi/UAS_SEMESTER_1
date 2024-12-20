/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author My PC
 */
public class mobilberaksi {
public static void main(String [] args){
    mobil mobilMelvin = new mobil ();
    
    mobilMelvin.warna = "hitam";
    mobilMelvin.type = "JEP";
    mobilMelvin.TahunProduksi = 2019;
    
    System.out.println("warna: " + mobilMelvin.warna);
    System.out.println("type: " + mobilMelvin.type);
    System.out.println("TahunProduksi: " + mobilMelvin.TahunProduksi);
}
}