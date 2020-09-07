package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class _nested_loops {

	public static void main(String[] args) {
		
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		
		}
		System.out.println();
		for (int j = 100; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println();
		for (int k = 1; k < 101; k++) {
			
			if (k % 2 == 0) {
				System.out.println(k);
			}
		}
		System.out.println();
		for (int l = 0; l < 100; l++) {
			
			if (l % 2 == 1) {
				System.out.println(l);
			}
		}
		System.out.println();
		for (int m = 0; m < 501; m++) {
			
			if (m % 2 == 0) {
				System.out.println(m + " is even");
			}
			else {
				System.out.println(m + " is odd");
			}
		}
		System.out.println();
		for (int n = 0; n < 778; n++) {
			
			if (n % 7 == 0) {
				System.out.println(n);
			}
		}
		int age = -1;
		System.out.println();
		for (int o = 2005; o < 2020; o++) {
			age++;
			System.out.println("In " + o + ", I was " + age + " years old.");
			
		}
		System.out.println();
		for (int p = 0; p < 3; p++) {
			
			for (int q = 0; q < 3; q++) {
				System.out.println(p + ", " + q);
				
			}
		}
		System.out.println();
		
		for (int r = 1; r < 10;) {
			
			System.out.println(r + " " + r + 1 + " " + r + 2);
			r = r + 3;
			
		}
	}

	
	
	
	
}
