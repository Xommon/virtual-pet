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
		pet.displayOptions();
		System.out.println("(\\___/)\n( 'x' )\nc(\")(\")");

		while (dead == false) {

			String optionEntered = input.nextLine();

			// 1: Feed
			if (optionEntered.equals("1")) {
				System.out.println("You give " + getName + " some snacks. Yummy!");
				pet.feedPet();
				pet.displayStats();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
				pet.displayOptions();
			}

			// 2: Water
			if (optionEntered.equals("2")) {
				System.out.println("You give " + getName + " some water.");
				pet.waterPet();
				pet.displayStats();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
				pet.displayOptions();
			}

			// 3: Player
			if (optionEntered.equals("3")) {
				System.out.println("You play with " + getName + "!");
				pet.playPet();
				pet.displayStats();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
				pet.displayOptions();
			}

			// 4: Bathroom
			if (optionEntered.equals("1")) {
				System.out.println("You let " + getName + " outside to pee.");
				pet.peePet();
				pet.displayStats();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
				pet.displayOptions();
			}

			// 5: Sleep
			if (optionEntered.equals("1")) {
				System.out.println("You tuck " + getName + " in for a nap.");
				pet.napPet();
				pet.displayStats();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
				pet.displayOptions();
			}
		}

	}

}
