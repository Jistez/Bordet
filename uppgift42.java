package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift42 {

	public static void main(String[] args) {

		double årskortpris, biljettpris, besök, totalpris;
		String s1, s2, s3;

		s1 = JOptionPane.showInputDialog("Pris på årskort?");
		årskortpris = Double.parseDouble(s1);
		s2 = JOptionPane.showInputDialog("Pris på biljett?");
		biljettpris = Double.parseDouble(s2);
		s3 = JOptionPane.showInputDialog("Antal planerade besök?");
		besök = Double.parseDouble(s3);
		totalpris = biljettpris * besök;
		if (totalpris >= årskortpris) {
			JOptionPane.showMessageDialog(null, "Köp årskort!");
		} else {
			JOptionPane.showMessageDialog(null, "Köp inte årskort");
		}

	}

}
