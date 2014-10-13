
package bol2ej5;

import java.util.Scanner;

public class Bol2Ej5 {

    public static void main(String[] args) {
        
        double millas = 0;
        
        System.out.println("Introduzca la distncia en millas para pasarla a metros:");
        Scanner rec_millas = new Scanner (System.in);
        
        millas = rec_millas.nextDouble();
        
        System.out.println(+millas + " millas equivalen a " + (millas * 609.344 )+ " metros");
        
    }
    
}
