/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author My PC
 */
public class matematika {
    private int tambah;
    private int kurang;
    private int kali;
    private int bagi;

    void setPertambahan (int a, int b){
        tambah = a + b;
    }
    void setPengurangan(int a, int b){
        kurang = a - b;
    }
    void setPerkalian(int a, int b){
        kali = a * b;
    }
    void setPembagian(int a, int b){
        bagi = a / b;
    }
    int getPertambahan (){
        return tambah;
    }
    int getPengurangan (){
        return kurang;
    }
    int getPerkalian (){
        return kali;
    }
    int getPembagian (){
        return bagi; 
    }
}
