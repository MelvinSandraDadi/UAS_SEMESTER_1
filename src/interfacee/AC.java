/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacee;

/**
 *
 * @author My PC
 */
public class AC implements interfaceAC{
 int statusAC;

 public void hidupkanAC(){
        if(statusAC == KEADAAN_MATI){
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! = AC akan dinyalakan dalam 1 mnt");
        } else {
            System.out.println("Hidupkan AC! = AC sudah berhasil dinyalakan");
        }
    }

    public void matikanAC(){
        if(statusAC == KEADAAN_HIDUP){
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! = AC akan dimatikan dalam 1 mnt");
        } else {
            System.out.println("Matikan AC!= AC sudah berhasil dimati");
        }
    }

    public void dinginkanAC(){
        if(statusAC == KEADAAN_PANAS){
            statusAC = KEADAAN_DINGIN;
            System.out.println("Dinginkan AC! = AC dalam proses mendinginkan suhu");
        } else {
            System.out.println("DInginkan AC! = AC dalam keadaan dingin dan siap dinikmati");
        }
    }

    public void panaskanAC(){
        if(statusAC == KEADAAN_DINGIN){
            statusAC = KEADAAN_PANAS;
            System.out.println("Panaskan AC! = AC dalam proses memanaskan suhu");
        } else {
            System.out.println("Panaskan AC! = AC dalam keadaan panas dan siap dinikmati");
        }
    }
}