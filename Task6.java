package assignment1;

public class Task6 {

	public static void main(String[] args) {
		// Write a program to print all prime numbers from 1-1000
		//It is divisible by 1 and itself
		
		int i=0;
		int n=1000;
		int num=0;
		String primes="";
		for(i=1;i<=n;i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			
			}
			if(count==2) {
				primes=primes+i + " ";
			}
		}
		System.out.println("Prime numbers are:"+ "\n"+primes);
		
	}

}
