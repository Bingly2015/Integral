
package Integral;

import java.util.Scanner;

public class Main {
	public static void main(String[] argsm){
	
		while(true){
		Integral integ=new Integral();
		RationalFunktion rfk=new RationalFunktion();
		rfk.konsolenEingabe();
		System.out.println( " Trapezregel mit 3 St�tzpunkte " + integ.trapez(rfk, 0, 1, 3));
		System.out.println( " Trapezregel mit 6 St�tzpunkte " + integ.trapez(rfk, 0, 1, 6));
		System.out.println( " Trapezregel mit 9 St�tzpunkte " + integ.trapez(rfk, 0, 1, 9));
		System.out.println( " Simpsonregel mit 3 St�tzpunkte " + integ.simpson(rfk, 0, 1, 3));
		System.out.println( " Simpsonregel mit 6 St�tzpunkte " + integ.simpson(rfk, 0, 1, 6));
		System.out.println( " Simpsonregel mit 9 St�tzpunkte " + integ.simpson(rfk, 0, 1, 9));
		
		Polynom pn=new Polynom();
		pn.konsolenEingabe();
		System.out.println( " Trapezregel mit 3 St�tzpunkte " + integ.trapez(pn, -1, 3, 3));
		System.out.println( " Trapezregel mit 5 St�tzpunkte " + integ.trapez(pn, -1, 3, 5));
		System.out.println( " Simpsonregel mit 3 St�tzpunkte "+  integ.simpson(pn, -1, 3, 3));
		System.out.println(  " Simpsonregel mit 5 St�tzpunkte "+ integ.simpson(pn, -1, 3, 5));
		
		
	      
		String weiter;
		System.out.println("M�chten sie noch ein Funktion berechnen");
	    Scanner sc=new Scanner(System.in);
	    weiter=sc.nextLine();
	    while(!weiter.equals("ja") && !weiter.equals("nein")){
	    	System.out.println("sie haben false eingeben, bitte ja oder nein eingeben");
	    	Scanner sc1=new  Scanner(System.in);
	    	weiter=sc1.nextLine();
	    	
	    	
	    }
	    if(weiter.equals("nein")){break;}
	}   
		
       
				}
}