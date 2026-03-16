import java.util.Scanner;

public class taskTen{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int firstNumber = userInput.nextInt();
	System.out.print("Enter a number: ");
	int secondNumber = userInput.nextInt();
	System.out.print("Enter a number: ");
	int thirdNumber = userInput.nextInt();
	
	float average = (firstNumber + secondNumber + thirdNumber) / 3;
	System.out.printf("The average of your three numbers are %.2f \n", average);
    }
}
