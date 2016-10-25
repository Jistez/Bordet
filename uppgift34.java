package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift34 {

	public static void main(String[] args) {

		double Minuter, Kostnadperminut, Kostnadpermånad;
		String s1;
		String s2;

		s1 = JOptionPane.showInputDialog("hur många gånger ringer du per månad?");
		Minuter = Double.parseDouble(s1);
		s2 = JOptionPane.showInputDialog("Vad är din minutkostnad?");
		Kostnadperminut = Double.parseDouble(s2);
		Kostnadpermånad = Minuter * Kostnadperminut;
		if (Kostnadpermånad >= 1000) {
			Kostnadpermånad = Kostnadpermånad * 0.9;
		}
		// if är uppgift 4.1
		JOptionPane.showMessageDialog(null, "Din kostnad per månad blir: " + Kostnadpermånad + " kr");

	}

}
