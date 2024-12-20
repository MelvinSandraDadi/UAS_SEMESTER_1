/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymoryphism;

/**
 *
 * @author My PC
 */
public class matematikacanggih extends matematika {
      void setmodulus (int a, int b){
        int modulus = a % b;
        System.out.println("hasil: " + modulus );
    }
    void setmodulus (double a, double b){
        double modulus = a % b;
        System.out.println("hasil: " + modulus );
    }
     void setmodulus (int a, int b, int c){
        int modulus = a % b % c;
        System.out.println("hasil: " + modulus );
    }
    void setmodulus (double a, double b, double c){
        double modulus = a % b % c;
        System.out.println("hasil: " + modulus );
    }
}
