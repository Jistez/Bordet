package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift45 {

	public static void main(String[] args) {
		double a, b , d;
		int minuter;
		int dagstid;
		String s1;
		
		a = 2.5;
		b = 0.55;
		s1 = JOptionPane.showInputDialog("Hur m�nga minuter var samtalet");
		minuter = Integer.parseInt(s1);
		
		
		dagstid = JOptionPane.showConfirmDialog(null, "Var samtalet under dagstid?", "v�lj", JOptionPane.YES_NO_OPTION);
		
		if (dagstid == 0){
			d = a* minuter + 0.6;
		}
		else {
			d= b * minuter + 0.6;
		}
		
		JOptionPane.showMessageDialog(null, "Ditt samtal kostade " + d + " kr");
	
	}

}
