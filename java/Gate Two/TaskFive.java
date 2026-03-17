import java.util.Scanner;
 
public class TaskFive{
    public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int userNumber = userInput.nextInt();
	int result = 1;
 
        for (int numbers = 1; numbers <= userNumber; numbers++){
		result *= numbers;
		} 
	System.out.printf("The factorial of %d is %d\n", userNumber, result);
	}
}
