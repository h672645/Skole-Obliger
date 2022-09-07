package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		String fakultettallTxt = showInputDialog("Skriv inn tallet du \n ønsker å see fakultetet av: ");
		int fakultettall = Integer.parseInt(fakultettallTxt);
		int sum = 1;
		
		System.out.println("Fakultet av n! når n -> "+fakultettall+"!");
		
		for(int i = fakultettall; i > 0; i--) {
			int fakultet = (i);
			sum *= i;
			System.out.print(fakultet + " * ");
			
		}
		
		System.out.println(" = " + sum);

	}

}
