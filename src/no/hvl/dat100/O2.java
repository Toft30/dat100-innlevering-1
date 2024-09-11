package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {

		double a = Double.parseDouble(showInputDialog("Lønn: "));
		double totalsum = 0;
		double max1 = (292859 - 208051) * 0.017;
		double max2 = (670000 - 292851) * 0.04;
		double max3 = (937900 - 670001) * 0.136;
		double max4 = (1350000 - 937901) * 0.166;
		
		if (a >= 1350001) {
			double trinn5 = a - 1350001;
			System.out.println((trinn5 * 17.6)/100 + max4 + max3 + max2 + max1);
		} else if (a <= 1350000 && a >= 937901) {
			double trinn4 = a - 937901;
			System.out.println((trinn4 * 16.6)/100 + max3 + max2 + max1);
		} else if (a <= 937900 && a >= 670001) {
			double trinn3 = a - 670001;
			System.out.println((trinn3 * 13.6)/100 + max2 + max1);
		} else if (a <= 670000 && a >= 292851) {
			double trinn2 = a - 292851;
			System.out.println((trinn2 * 4)/100 + max1);
		} else if (a <= 292850 && a >= 208051) {
			double trinn1 = a - 208051;
			System.out.println((trinn1 * 1.7)/100);
		} else if (a <= 208050 && a >= 0) {
			System.out.println("Ingen skatt");
		}
		
	}

}
