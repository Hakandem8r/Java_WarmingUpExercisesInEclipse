package _3_loops;

public class _3_WhileLoop {

	public static void main(String[] args) {
		
	/*	int i = 5;
		while (i>1) {
			System.out.println(i);
			i--;
		}   */
		
		
		int k = 1, fact = 1;
		while (k <= 5) {
			fact *=k;  //fact = fact*k
			System.out.println(k + "!" + "=" + fact);
			k++;
		}
		
		/*infinite loop
		while (true) {
			
		} */
		
		int d = 100;
		while (d == 100) { //this is an infinite while loop
			
		}
	}

}
