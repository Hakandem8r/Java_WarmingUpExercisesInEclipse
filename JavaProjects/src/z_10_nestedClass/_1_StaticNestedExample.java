package z_10_nestedClass;

public class _1_StaticNestedExample {
	
	static int a = 5;
	private static int b = 10;
	int c = 15;
	
	static class StaticNestedClass {
		void show () {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			//System.out.println("c = " + c); //It is non-static, so will be error
		}
	}

}
