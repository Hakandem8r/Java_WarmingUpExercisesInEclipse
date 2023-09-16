package _4_branchingStatements;

public class _3_ReturnStatement {

	public static void main(String[] args) {

		int k = 2;
		switch (k) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			return; 
//Bu durumda alttaki Welcome yazdırılamaz. Cünkü return mevcut methodtan cıkıs yaptırdı!
		}
		System.out.println("welcome");
	}

}
