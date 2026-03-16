import java.util.Scanner;

public class taskEight {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = userInput.nextInt();

	int squaredNumber = (int) Math.pow(number, 2);
	System.out.printf("The square of %d is %d \n",number, squaredNumber);
    }
}
