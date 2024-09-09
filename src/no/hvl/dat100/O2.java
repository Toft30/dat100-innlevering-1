package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {

		double a = Integer.parseInt(showInputDialog("Lønn: "));
		if (a >= 1350001) {
			System.out.println("Trinnskatt: " + (a * 17.6) / 100);
		} else if (a <= 1350000 && a >= 937901) {
			System.out.println("Trinnskatt: " + (a * 16.6) / 100);
		} else if (a <= 937900 && a >= 670001) {
			System.out.println("Trinnskatt: " + (a * 13.6) / 100);
		} else if (a <= 670000 && a >= 292851) {
			System.out.println("Trinnskatt: " + (a * 4) / 100);
		} else if (a <= 292850 && a >= 208051) {
			System.out.println("Trinnskatt: " + (a * 1.7) / 100);
		} else if (a <= 208050 && a >= 0) {
			System.out.println("Ingen skatt");
		}
		
	}

}
