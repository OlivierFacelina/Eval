package Eval;

public class High {

	public static int[] array = {1, 5, 67, 81, 36, 2, 4, 88 };
	public static void main(String[] args) {
		High high = new High();
		int max = high.max();
		System.out.println("La valeur maximum est : " + max);
	}
	
	public int max() {
		int max = array[0];

	    for (int j : array) {
	      if (j > max)
	        max = j;
	    }
		return max;
	}

}
