package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class O1 {
	public static void main(String[] args) {
		String inntektTxt = showInputDialog("Skriv inn din årslønn: ");
		double inntekt = parseDouble(inntektTxt);
		double etterSkatt;
		String utTxt = " ";
		
		if(inntekt <= 164100){
			etterSkatt = inntekt;
			utTxt = ("Du slipper å betale ekstra skatt.\n" + etterSkatt + "\nTrinn 0");
								
		} else if(inntekt >= 164101 && inntekt <= 230950) {
			etterSkatt = inntekt * 0.0093;
			utTxt = ("Du må betale " + etterSkatt + "kr mer i skatt\n" + "Trinn 1");
		} else if(inntekt >= 230951 && inntekt <= 580650) {
			etterSkatt = inntekt * 0.0241;
			utTxt = ("Du må betale " + etterSkatt + "kr mer i skatt\n" + "Trinn 2");
		} else if(inntekt >= 580651 && inntekt <= 934050) {
			etterSkatt = inntekt * 0.1152;
			utTxt = ("Du må betale " + etterSkatt + "kr mer i skatt\n" + "Trinn 3");
		} else if(inntekt >= 934051){
			etterSkatt = inntekt * 0.1452;
			utTxt = ("Du må betale " + etterSkatt + "kr mer i skatt\n" + "Trinn 4");
		}
		showMessageDialog(null, utTxt);
	}
	
	
}
