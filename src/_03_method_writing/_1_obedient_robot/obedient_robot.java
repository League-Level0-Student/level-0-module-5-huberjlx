package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {

	static Robot rob = new Robot();

	private static void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(90);
		}
	}
	
	private static void drawTriangle() {
		
		for (int triangle = 0; triangle < 3; triangle++) {
			rob.move(100);
			rob.turn(120);
			
		}
	
	}
	
	private static void drawCricle() {
		
		for (int circle = 0; circle < 20; circle++) {
			rob.move(10);
			rob.turn(20);
		}
	}

	public static void main(String[] args) {
		
		String shape = JOptionPane.showInputDialog("What shape would you like the robot to draw? ");
		rob.setSpeed(100);
		rob.setPenWidth(5);
		rob.penDown();
		String colors = JOptionPane.showInputDialog("What color would you like the robot to " + "\n"
				+ "draw with: Red, Green, blue or random?");
		if (colors.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.GREEN);
		}
		else if (colors.equalsIgnoreCase("Red")) {
			rob.setPenColor(Color.RED);
		}
		else if (colors.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.BLUE);
		}
		else {
			rob.setRandomPenColor();
		}
		
		
		if (shape.equalsIgnoreCase("circle")) {
			drawCricle();
		}
		else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		else if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		}


	}

}
