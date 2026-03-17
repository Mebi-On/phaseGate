import java.util.Scanner;
 
public class TaskSix{
    public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int userNumber = userInput.nextInt();
	int result = 0;
 
        for (int numbers = 1; numbers <= userNumber; numbers++){
		result += numbers;
		} 
	System.out.printf("The sum of 1 to %d is %d\n", userNumber, result);
	}
}
