package _4_branchingStatements;

public class _4_ReturnStatement {

	public static void main(String[] args) {

		boolean bool1 = true;
		System.out.println("Before the return");
		if ( bool1)
			return; //alttaki yazdırılamaz
//aynı method icinde, return'dan sonraki her statement compiler tarafından görmezden gelinecek
		
		System.out.println("This statement will not be executed");
	}

}
