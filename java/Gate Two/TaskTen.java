import java.util.Scanner;
 
public class TaskTen{
    public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int userNumber = userInput.nextInt();
	int number = userNumber;
	int count = 0;

	while(userNumber != 0){
		count += 1;
		userNumber  = userNumber / 10;
		}
     	System.out.printf("There are %d digits in the number %d \n", count, number)
;
	}
}
