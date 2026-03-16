import java.util.Scanner;

public class taskFour {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int userFirstNumber = userInput.nextInt();
	System.out.print("Enter another number: ");
	int userSecondNumber = userInput.nextInt();
	int product = userFirstNumber * userSecondNumber;
	System.out.printf("The product of both numbers is %d \n", product);
    }
}
