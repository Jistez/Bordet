package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift44 {

	public static void main(String[] args) {
		int l�ngd, bredd, tjocklek;
		String s1, s2, s3;

		s1 = JOptionPane.showInputDialog("L�ngd? (mm)");
		l�ngd = Integer.parseInt(s1);
		s2 = JOptionPane.showInputDialog("Bredd? (mm)");
		bredd = Integer.parseInt(s2);
		s3 = JOptionPane.showInputDialog("Tjocklek? (mm)");
		tjocklek = Integer.parseInt(s3);
		if (l�ngd < 600 && l�ngd > 140 && bredd > 90 && tjocklek < 100 && (bredd + l�ngd + tjocklek <= 900)) {
			JOptionPane.showMessageDialog(null, "M�tten OK");
		} else {
			JOptionPane.showMessageDialog(null, "Felaktiga m�tt");
		}

	}

}
