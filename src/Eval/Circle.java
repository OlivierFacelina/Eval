package Eval;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		circle.calcul();
		}

      int rayon = 10;
      public void calcul() {
    	  float perimeter = (float) (2 * 3.14 * rayon);
    	  System.out.println("Le périmètre est de : " + perimeter);
    	  float ground = (float) (3.14 * rayon * rayon);
    	  System.out.println("La surface est de : " + ground); 
      }
      public void showResults() {
    	  calcul();
      }
}
