package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
	int a = Integer.parseInt(showInputDialog("Skriv eit heiltall her"));
	int n = 1;
	
	
	for(int i = 1; i <= a; i++) {
		n *= i;
		
		System.out.println(n);
	}
	

	}

}
