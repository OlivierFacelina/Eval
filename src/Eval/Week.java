package Eval;

public class Week {

	public static void main(String[] args) {
		Week week = new Week();
		week.showDays();

	}
	
	public static String[] array = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };
	
	public void showDays() {
// Méthode pour afficher sur plusieurs lignes tous les jours de la semaine (je la commente car on doit modifier ce code après
//		for(String element: array) {
//			System.out.println(element);
//		}
		
		for(int i=0; i < array.length -2; i++) {
			System.out.println(array[i]);
		}
	}

}
