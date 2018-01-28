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
		thirst -= 10;
		fun -= 13;
		bladder -= 16;
		energy -= 29;
		System.out.println("You give " + name + " some snacks. Yummy!");
		System.out.println("(\\___/)\n( ^w^ )\nc(\")(\")");
		maxStats();
	}

	public void waterPet() {
		hunger -= 11;
		thirst += 35;
		fun -= 3;
		bladder -= 21;
		energy -= 5;
		System.out.println("You give " + name + " some water.");
		System.out.println("(\\___/)\n( ^w^ )\nc(\")(\")");
		maxStats();
	}

	public void playPet() {
		hunger -= 8;
		thirst -= 10;
		fun += 30;
		bladder -= 11;
		energy -= 25;
		System.out.println("You play with " + name + "!");
		System.out.println("(\\___/)\n( ^o^ )\nc(\")(\")");
		maxStats();
	}

	public void peePet() {
		hunger -= 14;
		thirst -= 14;
		fun -= 18;
		bladder = 100;
		energy -= 13;
		System.out.println("You let " + name + " outside to pee.");
		System.out.println("(\\___/)\n( ~.~ )\nc(\")(\")");
		maxStats();
	}

	public void napPet() {
		hunger -= 17;
		thirst -= 18;
		fun -= 13;
		bladder -= 15;
		energy = 100;
		System.out.println("You tuck " + name + " in for a nap.");
		System.out.println("(\\___/)\n( -x- ) zZZ\nc(\")(\")");
		maxStats();
	}

	public void overrideAction() {
		if (bladder <= 0) {
			hunger -= 18;
			thirst -= 18;
			fun -= 27;
			bladder = 100;
			energy -= 15;
			System.out.println(name + " peed themselves. Are you happy about that?");
			System.out.println("(\\___/)\n( ò-ó )\nc(\")(\")");
		} else if (energy <= 0) {
			hunger -= 28;
			thirst -= 28;
			fun -= 27;
			bladder -= 15;
			energy = 100;
			System.out.println(name + " collapsed from exhaution.");
			System.out.println("(\\___/)\n( @_@ )\nc(\")(\")");
			System.exit(0);
		} else if (hunger <= 0) {
			hunger = 0;
			thirst = 0;
			fun = 0;
			bladder = 0;
			energy = 0;
			System.out.println(name + " has died from starvation.");
			System.out.println("(\\___/)\n( x-x )\nc(\")(\")");
			System.exit(0);
		} else if (thirst <= 0) {
			hunger = 0;
			thirst = 0;
			fun = 0;
			bladder = 0;
			energy = 0;
			System.out.println(name + " has died from dehydration.");
			System.out.println("(\\___/)\n( x-x )\nc(\")(\")");
			System.exit(0);
		}
	}

	public void displayStats() {
		System.out.println("Hunger: " + hunger);
		System.out.println("Thirst: " + thirst);
		System.out.println("Fun: " + fun);
		System.out.println("Bladder: " + fun);
		System.out.println("Energy: " + energy);
	}
}
