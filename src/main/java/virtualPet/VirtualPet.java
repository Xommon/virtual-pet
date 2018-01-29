package virtualPet;

public class VirtualPet {
	private int hunger = 80;
	private int thirst = 80;
	private int fun = 80;
	private int bladder = 80;
	private int energy = 80;
	String name;

	public String setName(String nameInput) {
		return name = nameInput;
	}

	public void tick() {
		hunger -= 8;
		thirst -= 7;
		fun -= 10;
		bladder -= 5;
		energy -= 6;
	}

	public VirtualPet() {
	}

	public void maxStats() {
		if (hunger > 100) {
			hunger = 100;
		}
		if (thirst > 100) {
			thirst = 100;
		}
		if (fun > 100) {
			fun = 100;
		}
	}

	public void feedPet() {
		hunger += 35;
		energy -= 21;
		System.out.println("You give " + name + " some snacks. Yummy!");
		System.out.println("(\\___/)\n( ^w^ )\nc(\")(\")");
		maxStats();
	}

	public void waterPet() {
		thirst += 35;
		bladder -= 21;
		System.out.println("You give " + name + " some water.");
		System.out.println("(\\___/)\n( ^w^ )\nc(\")(\")");
		maxStats();
	}

	public void playPet() {
		fun += 30;
		energy -= 25;
		System.out.println("You play with " + name + "!");
		System.out.println("(\\___/)\n( ^o^ )\nc(\")(\")");
		maxStats();
	}

	public void peePet() {
		bladder = 100;
		System.out.println("You let " + name + " outside to pee.");
		System.out.println("(\\___/)\n( ~.~ )\nc(\")(\")");
		maxStats();
	}

	public void napPet() {
		hunger -= 11;
		thirst -= 13;
		fun -= 10;
		energy = 100;
		System.out.println("You tuck " + name + " in for a nap.");
		System.out.println("(\\___/)\n( -x- ) zZZ\nc(\")(\")");
		maxStats();
	}

	public void displayStats() {
		System.out.println("Hunger: " + hunger);
		System.out.println("Thirst: " + thirst);
		System.out.println("Fun: " + fun);
		System.out.println("Bladder: " + fun);
		System.out.println("Energy: " + energy);
	}
}
