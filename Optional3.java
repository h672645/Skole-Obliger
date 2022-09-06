package no.hvl.dat100;

import java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class Optional3 {
	public static void main (String[] args) {
		String tall1Txt = showInputDialog("Skriv inn tall nr.1: ");
		String tall2Txt = showInputDialog("Skriv inn tall nr.1: ");
		String tall3Txt = showInputDialog("Skriv inn tall nr.1: ");
		int tall1 = Integer.parseInt(tall1Txt);
		int tall2 = Integer.parseInt(tall2Txt);
		int tall3 = Integer.parseInt(tall3Txt);
		int tempTall1 = 0;
		int tempTall2 = 0;
		int tempTall3 = 0;
		
		tempTall1 = Math.max(tall1, Math.max(tall2, tall3));
		tempTall3 = Math.min(tall1, Math.min(tall2, tall3));
		
		if(tall1 < tempTall1 && tall1 > tempTall3) {
			tempTall2 = tall1;
		} else if(tall2 < tempTall1 && tall2 > tempTall3) {
			tempTall2 = tall2;
		} else {
			tempTall2 = tall3;
		}
		
		System.out.println("Tall#1: " + tall1 + "   " + tempTall1);
		System.out.println("Tall#2: " + tall2 + "   " + tempTall2);
		System.out.println("Tall#3: " + tall3 + "   " + tempTall3);
		
	}
}
