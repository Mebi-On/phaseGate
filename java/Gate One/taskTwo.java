import java.util.Scanner;

public class taskTwo  {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int userAge = userInput.nextInt() + 5;
	System.out.printf("You will be %d in 5 years! \n", userAge);
    }
}
