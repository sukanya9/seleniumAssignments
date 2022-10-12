package assignment1;

public class Task1 {

	public static void main(String[] args) {
		
		
		// program to swap two number. For example a=10 and b=20 output should be a=20 and b=10
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping a value: "+a);
		System.out.println("Before swapping b value: "+b);
		int c=0;
		c=a+b;  //30
		b=c-b;  //10
		a=c-b;  //20
		System.out.println("After swapping a value: " +a);
		System.out.println("After swapping b value: "+b);

	}

}
