/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handphone;

/**
 *
 * @author My PC
 */
public class handphoneBeraksi {
public static void main(String [] args){
    handphone handphoneMelvin = new handphone ();
    
    handphoneMelvin.hidupkan = "tiung tiung";
    handphoneMelvin.lakukanPanggilan = "kring kring" ;
    handphoneMelvin.kirimPesan = "pesan berhasil" ;
    handphoneMelvin.matikan = "shut down" ;
    
    handphoneMelvin.hidupkan();
    handphoneMelvin.lakukanPanggilan();
    handphoneMelvin.kirimPesan();
    handphoneMelvin.matikan();
}
}