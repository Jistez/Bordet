package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift43 {

	public static void main(String[] args) {
		int poäng;
		String s1;

		s1 = JOptionPane.showInputDialog("Poäng?");
		poäng = Integer.parseInt(s1);
		if (poäng < 25) {
			JOptionPane.showMessageDialog(null, "F");
		} else {
			if (poäng > 25 && poäng < 30)
				;
			JOptionPane.showMessageDialog(null, "E");
		}
		if (poäng > 30 && poäng < 35) {
			JOptionPane.showMessageDialog(null, "D");
		}
		if (poäng > 35 && poäng < 40) {
			JOptionPane.showMessageDialog(null, "C");
		}
		if (poäng > 40 && poäng < 45) {
			JOptionPane.showMessageDialog(null, "B");
		}
		if (poäng > 45) {
			JOptionPane.showMessageDialog(null, "A");
		}
	}
}
