package assignment1;

public class Task10 {

	public static void main(String[] args) {
		// Write a program which will break the current execution if it find “Selenium”
		//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

		String languages[]= {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for(int i=0;i<languages.length;i++) {
			if(languages[i]=="Selenium") {
				System.out.println("Matched the Language at position: "+i);
				break;
			}
			else {
				System.out.println("Not Matched the language");
			}
		}

	}

}
