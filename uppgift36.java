package Uppgifter;

import javax.swing.JOptionPane;

public class uppgift36 {

	public static void main(String[] args) {

		int tid, min, sek, tim;

		String s = JOptionPane.showInputDialog("Hur många sekunder?");
		tid = Integer.parseInt(s);
		tim = tid / 3600;
		tid = tid % 3600;
		min = tid / 60;
		tid = tid % 60;
		sek = tid;
		JOptionPane.showMessageDialog(null, "Det tog: " + tim + "tim " + min + "min " + sek + "sek");

	}

}
