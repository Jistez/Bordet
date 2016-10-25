package Uppgifter;

import javax.swing.JOptionPane;

public class uppgift33 {

	public static void main(String[] args) {

		double d, r, o, a;
		String indata;

		d = 3.1415926536;

		indata = JOptionPane.showInputDialog("radiens längd");

		r = Double.parseDouble(indata);

		o = (r * 2) * d;

		a = r * r * d;

		JOptionPane.showMessageDialog(null, "omkretsen: " + o + " arean: " + a);

	}

}
