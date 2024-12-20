/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacee;

/**
 *
 * @author My PC
 */
public class ACberaksi {
    public static void main(String[] args) {
        AC acRuangan = new AC();
        
         System.out.println("Status AC saat ini: Mati");

        acRuangan.hidupkanAC();
        acRuangan.matikanAC();
        acRuangan.matikanAC();
        acRuangan.hidupkanAC();
        acRuangan.hidupkanAC();

        acRuangan.dinginkanAC();
        acRuangan.panaskanAC();
        acRuangan.panaskanAC();
        acRuangan.dinginkanAC();
        acRuangan.dinginkanAC();
    }
}