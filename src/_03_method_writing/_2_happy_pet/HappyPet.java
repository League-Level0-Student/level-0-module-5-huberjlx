package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String kindOfPet = JOptionPane.showInputDialog("What kind of pet would you like? ");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 1; i < 8; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What should you do to make ur pet happy? ", "Pet Questions", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give Pets", "Give Food", "Take on walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 1) {
				givePets();
			}
			else if (task == 2) {
				
				int done = 0;
				i = done;
				if (i >= done + 3) {
					giveFood();
				}
				else {
					JOptionPane.showMessageDialog(null, "You have done that already and is bad for your pet's health if you feed it too much.");
				}
			}
			else {
				takeOnWalk();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 70) {
				JOptionPane.showMessageDialog(null, "You love your pet.");
				break;
			}
		}

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void givePets() {
		JOptionPane.showMessageDialog(null, "Your pet loved the affection.");
		happinessLevel = happinessLevel + 10;
	}
	
	public static void giveFood() {
		JOptionPane.showMessageDialog(null, "Your pet was starving and is running back to you.");
		happinessLevel = happinessLevel + 30;
	}
	
	public static void takeOnWalk() {
		JOptionPane.showMessageDialog(null, "Your pet needed the exercise.");
		happinessLevel = happinessLevel + 20;
	}
}