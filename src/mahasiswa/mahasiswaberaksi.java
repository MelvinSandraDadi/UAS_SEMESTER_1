/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author My PC
 */
public class mahasiswaberaksi {
public static void main(String [] args){
    mahasiswa mahasiswaMELVIN = new mahasiswa ();
    
    mahasiswaMELVIN.membaca = "waktu mununjukan jamnya membaca";
    mahasiswaMELVIN.menyontek = "bagi seluruh mahasiswa dilarang mencontek";
    mahasiswaMELVIN.pulang = "sekarang jam 3 waktunya pulang";
    
    System.out.println("membaca: " + mahasiswaMELVIN.membaca);
    System.out.println("menyontek: " + mahasiswaMELVIN.menyontek);
    System.out.println("pulang: " + mahasiswaMELVIN.pulang);
} 
}
