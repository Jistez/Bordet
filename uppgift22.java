package Uppgifter;
import javax.swing.JOptionPane;

public class uppgit22 {

	public static void main(String[] args) {

		String s1 = JOptionPane.showInputDialog("Skriv en mening med minst två ord");
		
		int k=s1.lastIndexOf(' ');
		int c=s1.indexOf(' ');
		
		String b = s1.substring(k);
		String d = s1.substring(0, c);
		int a=s1.length();
		
				
		JOptionPane.showMessageDialog(null, "Meningen har " +  a + " tecken."  + "\n" + b + "\n" + d);
		
		
			
		
	}

}
