package Eval;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.play();
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Voulez-vous jouer ? O/N");
		String response = sc.nextLine();
		if(response.equals("O")) {
			Guess guess = new Guess();
			guess.game();
		}
	}
	
	public void success() {
		System.out.println("Incroyable !!!! Vous avez deviné le nombre.");
	}

}
