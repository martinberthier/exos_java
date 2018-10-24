package poo_exo1;

public class HumanLife {

	public static void main(String[] args) throws InterruptedException {
		
		Human pierre = new Human(50, 12, 9);
		Human paul = new Human(2, 6, 100);
		Human jacques = new Human();
		
//		life(pierre);
		
//		pierre.getNeed();
		System.out.println(pierre.getNeed());//0
		
		
		//si l'attribut est public, on peut y accéder avec un "." : nomObjet.nomAttribut
		System.out.println(paul.motivation);
		
		jacques.setEnergy(42);
		System.out.println(jacques.getEnergy());//42
		System.out.println(jacques.energy);//42

	}
	
	public static void life (Human personne) throws InterruptedException {
		
		while (true) {
			morning(personne);
			midday(personne);
			afternoon(personne);
			evening(personne);
			night(personne);
			Thread.sleep(1000);
		}
	}
	
	public static void morning (Human personne) {
		personne.poop();
		personne.eat();
		personne.work();
		personne.status();
	}
	
	public static void midday (Human personne) {
		personne.eat();
		personne.status();
	}
	
	public static void afternoon (Human personne) {
		personne.poop();
		personne.eat();
		personne.work();
		personne.status();
	}
	public static void evening (Human personne) {
		personne.eat();
		personne.play();
		personne.status();
	}
	
	public static void night (Human personne) {
		personne.sleep();
		personne.status();
	}
	
}



