package assignment1;

public class Task5 {

	public static void main(String[] args) {
		// Write a program to print all odd numbers from 1-50
		
		int n=50;
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			if(i%2==1) {
				sum=sum+i;
				System.out.println("Odd numbers:"+i);
			}
		
		}
		System.out.println("Sum of all odd numbers:"+sum);

	}

}
