package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
        skills.skill1();
        skills.skill2();
        skills.skill3();
        skills.skill4();
        skills.skill5();
		
	}
	
	void skill1() {
		
		String question = JOptionPane.showInputDialog("How many dimes do you have? ");
		
		int answer = Integer.parseInt(question);
		answer = answer * 10;
		
		JOptionPane.showMessageDialog(null, "You have " + answer + " cents");
		
		String height = JOptionPane.showInputDialog("How tall are you? (inches): ");
		int newHeight = Integer.parseInt(height);
		
		if (newHeight <= 36) {
			
			JOptionPane.showMessageDialog(null, "Eat your wheaties.");
		}
		
	}
	
	void skill2() {
		
		for (int i = 1; i < 31; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
	}
	
	void skill3() {
		
		Random num = new Random();
		
		int number = num.nextInt(21);
		
		int newNum = num.nextInt(10);
		
		int difference = 0;
		
		difference = number - newNum;
		
		JOptionPane.showMessageDialog(null, "The difference is " + difference);
		
	}
	
	void skill4() {
		
		String city = JOptionPane.showInputDialog("What city do you live in? ");
		
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "America's finest city.");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "You should move to San Diego.");
		}
		
		String car = JOptionPane.showInputDialog("How many cars does your family have? ");
		int cars = Integer.parseInt(car);
		
		if (cars == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
		}
		else if (cars == 1) {
			JOptionPane.showMessageDialog(null, "Its a 2017 Subaru Outback.");
		} else {
			int wheels = 0;
			wheels = cars * 4;
			JOptionPane.showMessageDialog(null, wheels);
		}
	}
	
	void skill5() {
		
		String school = JOptionPane.showInputDialog("What school do you go to? ");
		
		JOptionPane.showMessageDialog(null, school + " is a great school.");
	}

}

	