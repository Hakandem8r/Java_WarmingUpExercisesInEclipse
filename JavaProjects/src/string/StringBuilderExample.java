package string;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder ("Welcome to");
		builder.append(" Java"); //mutable (changeable) builder object 
		//builder objects points out "welcome to java"
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println(builder.insert(builder.length(), " world"));
		System.out.println(builder.reverse());
		System.out.println(builder.reverse()); //to get the original string
		System.out.println(builder.delete(0, 11)); 

	}

}
