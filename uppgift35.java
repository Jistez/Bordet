package Uppgifter;
import javax.swing.JOptionPane;

public class uppgift35 {

	public static void main(String[] args) {
		String s1, s2;
		double pris, exkl, moms;
		int procent;
		s1 = JOptionPane.showInputDialog(null, "Pris (inklusive moms)?");
		pris = Double.parseDouble(s1);
		s2 =JOptionPane.showInputDialog("Momssats?");
		procent = Integer.parseInt(s2);
		exkl = pris * (1 - 0.01 * procent);
		moms = pris - exkl;
		JOptionPane.showMessageDialog(null, "Pris (exkl.moms): " + exkl + "\nMoms: " + moms);
	}
}	
	

	