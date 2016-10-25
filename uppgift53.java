package Uppgifter;

import javax.swing.JOptionPane;

public class uppgift53 {

	public static void main(String[] args) {
		double höjd;
		int studs = 0;
		String s1;

		s1 = JOptionPane.showInputDialog(null, "Höjd (m)?");
		höjd = Double.parseDouble(s1);
		while (höjd > 0.01) {
			höjd = höjd * 0.7;
			studs = studs + 1;
		}
		JOptionPane.showMessageDialog(null, "Bollen studsar " + studs + " gånger");
	}

}
