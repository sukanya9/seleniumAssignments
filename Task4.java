package assignment1;

public class Task4 {

	public static void main(String[] args) {
		// Write a program to print all even numbers from 1-200
		
		int n=200;  
		int sum=0;
		for(int i=2;i<=n;i++) {
				
			if(i%2==0) {
				sum=sum+i;
				System.out.println("Even numbers :"+i);
				
			}
		}
		
			System.out.println("Sum of all even numbers:"+sum);
		

	}

}
