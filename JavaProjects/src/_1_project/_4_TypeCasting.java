package _1_project;

public class _4_TypeCasting {

	public static void main(String[] args) {
		
		int a = 124;
		
		int b=a;
		
		int d=b;
		
		System.out.println("int value= " + a);
		System.out.println("long value = " + b);
		System.out.println("double value = " + d);
		
		double s = 86.01;
		long m = (long) s; //add cast to...
		byte c = (byte) m;
		
		System.out.println("double value = " + s);
		System.out.println("long value = " + m);
		System.out.println("byte value = " + c);
		

	}

}
