package z_10_nestedClass;

public class _4_InnerTest {

	public static void main(String[] args) {

		_3_InnerClassExample outer = new _3_InnerClassExample();
		_3_InnerClassExample.InnerClass inner = outer.new InnerClass();
		
		inner.show();
	}

}
