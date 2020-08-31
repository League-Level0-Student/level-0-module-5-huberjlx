package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class _2_fibbonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int sum;
		
		JOptionPane.showMessageDialog(null, num1);
		JOptionPane.showMessageDialog(null, num2);
		
		for (int i = 0; i < 10; i++) {
			
			sum = num1 + num2;
			JOptionPane.showMessageDialog(null, sum);
			num1 = num2;
			num2 = sum;
			
		}

	}

}
