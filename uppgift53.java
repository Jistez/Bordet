package Uppgifter;

import javax.swing.JOptionPane;

public class uppgift53 {

	public static void main(String[] args) {
		double h�jd;
		int studs = 0;
		String s1;

		s1 = JOptionPane.showInputDialog(null, "H�jd (m)?");
		h�jd = Double.parseDouble(s1);
		while (h�jd > 0.01) {
			h�jd = h�jd * 0.7;
			studs = studs + 1;
		}
		JOptionPane.showMessageDialog(null, "Bollen studsar " + studs + " g�nger");
	}

}
