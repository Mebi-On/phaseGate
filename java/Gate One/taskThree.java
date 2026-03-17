import java.util.Scanner;

public class TaskThree  {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int userFirstNumber = userInput.nextInt();
	System.out.print("Enter another number: ");
	int userSecondNumber = userInput.nextInt();
	int sum = userFirstNumber + userSecondNumber;
	System.out.printf("The sum of both numbers is %d \n", sum);
    }
}
