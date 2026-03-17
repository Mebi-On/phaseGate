import java.util.Scanner;
 
public class TaskSeven{
    public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	int sumOfNumbers = 0;
	
	int count = 0;

	while(count != 5){
		System.out.printf("Enter number %d: ", (count + 1));
		int userNumber = userInput.nextInt();
		sumOfNumbers += userNumber;
		count += 1;
		}
     	System.out.printf("The sum of all your numbers is %d\n", sumOfNumbers);
	}
}
