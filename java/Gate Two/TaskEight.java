import java.util.Scanner;
 
public class TaskEight{
    public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	int sumOfNumbers = 0;
	
	boolean continueAsking = true;

	while(continueAsking){
		System.out.print("Enter a number (Enter 0 to stop): ");
		int userNumber = userInput.nextInt();
		sumOfNumbers += userNumber;
		
		if (userNumber == 0 ){
			continueAsking = false;
			}
		}
     	System.out.printf("The sum of all your numbers is %d\n", sumOfNumbers);
	}
}
