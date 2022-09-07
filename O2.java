package no.hvl.dat100;
import static javax.swing.JOptionPane.*;


public class O2 {
	public static void main (String[] args) {
	
		int elever = 1;
		int inputs = 1;
		
		for(elever = 1; elever <=10; elever++ ) {
	    String poengTxt = showInputDialog("Hvor mange poeng fikk du på prøven?");
	    int poeng = Integer.parseInt(poengTxt);
	    boolean inputTxt = true;
	    
	    String utTxt = "P";
	    	    
	    if (poeng >=0 && poeng <= 39) {
			utTxt = ("Poengsummen " + poeng + " gir karakter: F\nPrøv bedre neste gang!");
		} else if(poeng >= 40 && poeng <= 49) {
			utTxt = ("Poengsummen " + poeng + " gir karakter: E");
		} else if(poeng >=50 && poeng <= 59) {
			utTxt = ("Poengsummen " + poeng + " gir karakter: D");
		} else if(poeng >=60 && poeng <= 79) {
			utTxt = ("Poengsummen " + poeng + " gir karakter: C");
		} else if(poeng >=80 && poeng <= 89) {
			utTxt = ("Poengsummen " + poeng + " gir karakter: B");
		} else if(poeng >=90 && poeng <= 100) {
			utTxt = ("Poengsummen " + poeng + " gir karakter: A\nGodt jobbet!");
		} else if(poeng < 0 || poeng > 100) {
			utTxt = ("Feil poengverdi skrevet inn.\nPrøv på nytt!");
			elever--;
			inputs--;
			inputTxt=false;
		}
		if(inputTxt) { 
	    utTxt += "\nInput nr: " + inputs + "\n";
		}
		inputs++;
		showMessageDialog(null, utTxt);
		}
	}

}
