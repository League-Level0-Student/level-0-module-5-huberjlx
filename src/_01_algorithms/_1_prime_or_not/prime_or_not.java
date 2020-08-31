package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("What number do you want: ");
		
		int num1 = Integer.parseInt(num);
		
		for (int i = 2; i <= num1/2; i++) {
			
			if (num1 % i == 0) {
				JOptionPane.showMessageDialog(null, "The number is prime");
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "The number is not prime");
			}

		}

	}

}
