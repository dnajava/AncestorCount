/**
  * AncestorCount laskee henkilöiden lukumäärän esipolvissa ja antaa
  * suuntaa-antavan arvion syntymävuosikymmenestä.
  *
  * Kaava: n = 2 ** i - 1
  *
  *  @author Ilpo Kantonen 2016
  */
import java.lang.Math;

public class AncestorCount {

  static int spv[] = { 30,30,30,30,30,30,30,30,30,30,30,30 }; // Keskimääräiset lapsensaanti-iät nykyhetkestä historiaan päin.

  public static void main(String args[])
  {

    int i = 0;	// Sukupolvilaskuri
    int omaSyntymaVuosi = 1962;	// Oma syntymävuosi
    
    System.out.println("Montako henkeä on esipolvissa.");
    
    System.out.println("Sukupolvi\tSyntymävuosi\tIhmisiä");
    

    System.out.println( 0 + "\t\t" + omaSyntymaVuosi + "\t\t" + 1 );
    
    for(i=1; i<= spv.length - 1; i++)
    {
      System.out.println( i + "\t\t" + (omaSyntymaVuosi - yearCount(i) ) + "\t\t" + ( (int) ( java.lang.Math.pow(2, (i+1)) - 1)) );
    }
  }
  
  static private int yearCount(int i)
  {

    int count = 0;
    
    for(int apu = 0; apu < i; apu++)
    {
      count += spv[i];
    }
    
    return count;
  }
}
