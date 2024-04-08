package Eval;

import java.util.Scanner;

public class Guess {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Guess guess = new Guess();
		guess.game();
	}
	
	public void rules() {
		System.out.println("Vous devez deviner un nombre aléatoirement choisi par l'ordinateur entre 1 et 100.");
	}
	
	public boolean game() {
		rules();
		int random = random();
		boolean victory = false;
		while(victory == false) {
			int number = propositionPlayer();
			results(random, number, victory);
		}
		return victory;
	}
	
	public int random() {
		// Générer un nombre aléatoire entre 1 et 100
		int random = (int) (Math.random() * (100)) + 1;
		return random;
//		System.out.println(random);
	}
	
	public int propositionPlayer() {
		System.out.println("Pour cela, choisis un nombre");
		int number = sc.nextInt();
		System.out.println("Très bien. Vous avez choisi le nombre : " + number);
		return number;
	}
	
	public void results(int random, int number, boolean victory) {
//		System.out.println("L'ordinateur a tiré ce nombre : " + random);
		if(number < random) {
			System.out.println("Le nombre de l'ordinateur est plus grand.");
		}
		else if (number == random) {
			Main main = new Main();
			main.success();
			victory = true;
		}
		else {
			System.out.println("Le nombre de l'ordinateur est plus petit.");
		}
		
	}

}
