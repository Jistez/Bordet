package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift42 {

	public static void main(String[] args) {

		double �rskortpris, biljettpris, bes�k, totalpris;
		String s1, s2, s3;

		s1 = JOptionPane.showInputDialog("Pris p� �rskort?");
		�rskortpris = Double.parseDouble(s1);
		s2 = JOptionPane.showInputDialog("Pris p� biljett?");
		biljettpris = Double.parseDouble(s2);
		s3 = JOptionPane.showInputDialog("Antal planerade bes�k?");
		bes�k = Double.parseDouble(s3);
		totalpris = biljettpris * bes�k;
		if (totalpris >= �rskortpris) {
			JOptionPane.showMessageDialog(null, "K�p �rskort!");
		} else {
			JOptionPane.showMessageDialog(null, "K�p inte �rskort");
		}

	}

}
