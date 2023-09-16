package string;

public class StringBufferExapmle {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer ("Welcome to");
		buffer.append(" Java"); //mutable (changeable) buffer object 
		//buffer objects points out "welcome to java"
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.insert(buffer.length(), " world"));
		System.out.println(buffer.reverse());
		System.out.println(buffer.reverse()); //to get the original string
		System.out.println(buffer.delete(0, 11));

	}

}
