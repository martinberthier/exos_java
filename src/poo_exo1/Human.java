package poo_exo1;

public class Human {
	 int energy = 0;
	private int tiredness = 0;
	public int motivation = 0;
	private int need = 0;
	private boolean active = false;
	
	void eat () {
		if (energy<=65) {energy +=35;} else if (energy <0) {energy = 0;} else {energy = 100;}
		if (tiredness<=100) {tiredness +=15;} else if (tiredness <0) {tiredness = 0;} else {tiredness = 100;}
		if (need<=100) {need =+15;} else if (need <0) {need = 0;} else {need = 100;}
	}
	
	void sleep () {
		tiredness =0;
		if (need<=85) {need +=15;} else if (need <0) {need = 0;} else {need = 100;}
	}
	
	void work () {
		if (tiredness<=85) {tiredness +=15;} else if (tiredness <0) {tiredness = 0;} else {tiredness = 100;}
		if (need<=100) {need +=15;} else if (need <0) {need = 0;} else {need = 100;}
	}
	
	void play () {
		if (energy<=100) {energy -=20;} else if (energy <0) {energy = 0;} else {energy = 100;}
		if (motivation<=85) {motivation +=15;} else if (motivation <0) {motivation = 0;} else {motivation = 100;}
	}
	
	void poop () {
		need=0;
	}
	
//	void grignoter () {
//		while (energy <15) {energy ++;}
//		while (need < 12) {need ++;}
//		if (tiredness <= 90) { tiredness += 10;} else {tiredness = 100;}
//		
//	}
	
	//Constructor 
	public Human (int energy, int tiredness, int motivation) {
		this.energy = energy;
		this.tiredness = tiredness;
		this.setMotivation(motivation);
		
	}
	
	//empty constructor
	public Human () {
		
	}
	
//	public Human (int motivation) {
//		this.setMotivation(motivation);
//	}
	
	//getter
	public int getNeed () {
		return need;
	}
	
	//setter
	public void setMotivation (int motivation) {
		this.motivation = motivation;
	}

	
	void status () {
		System.out.println("Energy = "+ this.energy
				+"\nTiredness = "+ this.tiredness
				+"\nMotivation = "+ this.motivation
				+"\nNeed = "+ this.need
				+"\nActive = "+ this.active);
	}
	
	//sources / gennerate constructor using fields
	public Human(int energy, int tiredness, int motivation, int need, boolean active) {
		super();
		this.energy = energy;
		this.tiredness = tiredness;
		this.motivation = motivation;
		this.need = need;
		this.active = active;
	}
	
	//sources / generate getters and setters

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getTiredness() {
		return tiredness;
	}

	public void setTiredness(int tiredness) {
		this.tiredness = tiredness;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getMotivation() {
		return motivation;
	}

	public void setNeed(int need) {
		this.need = need;
	}
	
	
	
	

	
}












