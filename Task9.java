package assignment1;

public class Task9 {

	public static void main(String[] args) {
		// Write a program which will break the current execution if it find number 85
		//Input – [12,34,66,85,900]
		
		int num[]= {12,34,66,85,900};
		for(int i=0;i<num.length;i++){
			if(num[i]==85) {
				System.out.println("85 is available at position "+i);
				break;
			}
			else {
				System.out.println("85 is not available");
			}
		}
		


	}

}
