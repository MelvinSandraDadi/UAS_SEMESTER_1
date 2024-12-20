/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author My PC
 */
public class matematikacanggihberaksi {
public static void main(String[] args) {
        matematikacanggih mtk = new matematikacanggih();

        mtk.setPertambahan(12, 12);
        System.out.println("Hasil dari Pertambahan = " + mtk.getPertambahan());

        mtk.setPengurangan(97, 23);
        System.out.println("Hasil dari Pengurangan = " + mtk.getPengurangan());

        mtk.setPerkalian(8, 4);
        System.out.println("Hasil dari Perkalian   = " + mtk.getPerkalian());

        mtk.setPembagian(16, 2);
        System.out.println("Hasil dari Pembagian   = " + mtk.getPembagian());

        mtk.setModulus(60, 3);
        System.out.println("Hasil dari Modulus     = " + mtk.getModulus()); 
    }
}
