package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift43 {

	public static void main(String[] args) {
		int po�ng;
		String s1;

		s1 = JOptionPane.showInputDialog("Po�ng?");
		po�ng = Integer.parseInt(s1);
		if (po�ng < 25) {
			JOptionPane.showMessageDialog(null, "F");
		} else {
			if (po�ng > 25 && po�ng < 30)
				;
			JOptionPane.showMessageDialog(null, "E");
		}
		if (po�ng > 30 && po�ng < 35) {
			JOptionPane.showMessageDialog(null, "D");
		}
		if (po�ng > 35 && po�ng < 40) {
			JOptionPane.showMessageDialog(null, "C");
		}
		if (po�ng > 40 && po�ng < 45) {
			JOptionPane.showMessageDialog(null, "B");
		}
		if (po�ng > 45) {
			JOptionPane.showMessageDialog(null, "A");
		}
	}
}
