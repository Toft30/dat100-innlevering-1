package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

	public static void main(String[] args) {
		
		for (int antall=0;antall<10;antall++) {
			int a;
		do {
			a = Integer.parseInt(showInputDialog("Poeng: "));
			if (a<0 || a>100) {
				showMessageDialog(null, "Ugyldig poengsum!");
			}else if (a >= 90 && a <= 100) {
				System.out.println("A");
			} 
			else if (a >= 80 && a <=89) {
				System.out.println("B");
			} 
			else if (a >= 60 && a<=79) {
				System.out.println("C");
			} 
			else if (a >=50 && a<=59) {
				System.out.println("D");
			}
			else if (a>=40 && a<=49) {
				System.out.println("E");
			}
			else if (a>=0 && a<=39){
				System.out.println("F");
			}
		}	while (a<0 || a>100);
			
		}
		
		
	}

}
