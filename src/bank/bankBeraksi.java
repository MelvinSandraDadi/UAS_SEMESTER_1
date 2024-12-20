/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author My PC
 */
public class bankBeraksi {
    public static void main (String [] args) {
        bank bk = new bank (1000000);
        bk.cekSaldo ();
        bk.simpanUang(50000);
        bk.ambil (50000);
    }
}
