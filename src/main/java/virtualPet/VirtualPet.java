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
		thirst -= 23;
		fun -= 17;
		bladder -= 20;
		energy -= 34;
		System.out.println("(\\___/)\n( ^w^ )\nc(\")(\")");
		maxStats();
	}

	public void waterPet() {
		hunger -= 21;
		thirst += 35;
		fun -= 9;
		bladder -= 36;
		energy -= 11;
		maxStats();
	}

	public void playPet() {
		hunger -= 20;
		thirst -= 22;
		fun += 10;
		bladder -= 24;
		energy -= 37;
		maxStats();
	}

	public void peePet() {
		hunger -= 21;
		thirst -= 21;
		fun -= 26;
		bladder = 100;
		energy -= 14;
		maxStats();
	}

	public void napPet() {
		hunger -= 35;
		thirst -= 34;
		fun -= 23;
		bladder -= 24;
		energy = 100;
		maxStats();
	}

	public void displayOptions() {
		System.out.println("What would you like to do?");
		System.out.println("1: Feed " + this.name + " snacks");
		System.out.println("2: Give " + this.name + " some water");
		System.out.println("3: Play with " + this.name);
		System.out.println("4: Take " + this.name + " to the bathroom");
		System.out.println("5: Put " + this.name + " down for a nap");
	}

	public void displayStats() {
		System.out.println("Hunger: " + hunger);
		System.out.println("Thirst: " + thirst);
		System.out.println("Fun: " + fun);
		System.out.println("Bladder: " + fun);
		System.out.println("Energy: " + energy);
	}

	// public double play() {
	// return fun;
	// }
	//
	// public double pee() {
	// return bladder;
	// }
	//
	// public double sleep() {
	// return energy;
	// }

}
