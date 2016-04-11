/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ancestorcount;

/**
 * Laskee summittaisen laskennallisen arvion esipolvien syntymävuodesta
 * ja tarkan määrän ihmisten lukumäärästä esipolvissa.
 * 
 * @author Ilpo Kantonen 6.1.2016
 */
public class AncestorCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int ANCESTORS = 16;		// Sukupolvien maksimimäärä
        final int AVEMOTHAGE = 30;		// Äidin keskimääräinen ikä synnyttäessä

        int i = 0;				// Sukupolvilaskuri
        int omaSyntymaVuosi = 1962;		// Oma syntymävuosi

        System.out.println("Sukupolvi\tSyntymävuosi\tIhmisiä");

        System.out.println( 0 + "\t\t" + omaSyntymaVuosi + "\t\t" + 1 );

        for(i=1; i<= ANCESTORS; i++)
        {
          System.out.println( i + "\t\t" + (omaSyntymaVuosi - AVEMOTHAGE * i ) + "\t\t" + ( (int) ( java.lang.Math.pow(2, (i+1)) - 1)) );
        }

    }
    
}
