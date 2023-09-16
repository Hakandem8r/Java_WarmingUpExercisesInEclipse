package _3_loops;

public class _2_ForEachLoop {

	public static void main(String[] args) {
		
	/*	char[] letters = {'h','e','l','l','o'};
		for (int i = 0; i<letters.length; i++) {
			System.out.println(letters[i]);
		}   */
		
		
	/*	//using for each loop
		char[] letters = {'h','e','l','l','o'};
		for (char item : letters) {
			System.out.println(item);
		}
		*/
		
		int[] numbers = {6,4,3,5};
		int sum = 0;
		for (int num : numbers) {
			sum+=num;
			System.out.println(num);
		}
		System.out.println("Sum of numbers: "+ sum);
	}   

}
