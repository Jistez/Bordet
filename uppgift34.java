package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift34 {

	public static void main(String[] args) {

		double Minuter, Kostnadperminut, Kostnadperm�nad;
		String s1;
		String s2;

		s1 = JOptionPane.showInputDialog("hur m�nga g�nger ringer du per m�nad?");
		Minuter = Double.parseDouble(s1);
		s2 = JOptionPane.showInputDialog("Vad �r din minutkostnad?");
		Kostnadperminut = Double.parseDouble(s2);
		Kostnadperm�nad = Minuter * Kostnadperminut;
		if (Kostnadperm�nad >= 1000) {
			Kostnadperm�nad = Kostnadperm�nad * 0.9;
		}
		// if �r uppgift 4.1
		JOptionPane.showMessageDialog(null, "Din kostnad per m�nad blir: " + Kostnadperm�nad + " kr");

	}

}
