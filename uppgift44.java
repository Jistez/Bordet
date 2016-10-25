package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift44 {

	public static void main(String[] args) {
		int längd, bredd, tjocklek;
		String s1, s2, s3;

		s1 = JOptionPane.showInputDialog("Längd? (mm)");
		längd = Integer.parseInt(s1);
		s2 = JOptionPane.showInputDialog("Bredd? (mm)");
		bredd = Integer.parseInt(s2);
		s3 = JOptionPane.showInputDialog("Tjocklek? (mm)");
		tjocklek = Integer.parseInt(s3);
		if (längd < 600 && längd > 140 && bredd > 90 && tjocklek < 100 && (bredd + längd + tjocklek <= 900)) {
			JOptionPane.showMessageDialog(null, "Måtten OK");
		} else {
			JOptionPane.showMessageDialog(null, "Felaktiga mått");
		}

	}

}
