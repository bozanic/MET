import java.io.*;
/**
 * Klasse zum Erzeugen von Auto Objekten.
 * 
 * @author Borislav Bozanic
 * @version 0.01, 10/2013
 */

public class EinfachesAutoTest{
	
	public static void main(String[] args){
	
	EinfachesAuto autoOne = new EinfachesAuto("Boris", "Golf", "weiss", 2008, 120, 70000);
	EinfachesAuto autoTwo = new EinfachesAuto("Walter", "Pontiak Aztek ", "creme", 2005, 188, 98000);
	EinfachesAuto autoThree = new EinfachesAuto("Charly", "Mecedes", "blau", 2003, 220, 40000);
	
	autoOne.meldung();
	System.out.println (" dieses Auto ist " + autoOne.getAlter() + " Jahre alt");
	System.out.println ("");
	autoTwo.meldung();
	System.out.println (" dieses Auto ist " + autoTwo.getAlter() + " Jahre alt");
	System.out.println ("");
	autoThree.meldung();
	System.out.println (" dieses Auto ist " + autoThree.getAlter() + " Jahre alt");
	
	
	}

}


