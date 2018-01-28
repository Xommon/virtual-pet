package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet pet = new VirtualPet();

		// Introduction
		System.out.println("Welcome to the Virtual Pet App!\n");
		System.out.println("Please name your pet.");
		String getName = input.nextLine();
		pet.setName(getName);

		boolean dead = false;
		pet.displayStats();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("(\\___/)\n( 'x' )\nc(\")(\")");

		while (dead == false) {
			System.out.println("What would you like to do?");
			System.out.println("1: Feed " + getName + " snacks");
			System.out.println("2: Give " + getName + " some water");
			System.out.println("3: Play with " + getName);
			System.out.println("4: Take " + getName + " to the bathroom");
			System.out.println("5: Put " + getName + " down for a nap");

			String optionEntered = input.nextLine();

			pet.tick();

			if (optionEntered.equals("1")) {
				pet.feedPet();
			} else if (optionEntered.equals("2")) {
				pet.waterPet();
			} else if (optionEntered.equals("3")) {
				pet.playPet();
			} else if (optionEntered.equals("4")) {
				pet.peePet();
			} else if (optionEntered.equals("5")) {
				pet.napPet();
			} else {
				System.out.println("You do nothing with " + getName);
				System.out.println("(\\___/)\n( >-> )\nc(\")(\")");
			}

			System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
			pet.displayStats();
		}
	}
}
