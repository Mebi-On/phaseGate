import java.util.Scanner;
 
public class TaskFour{
    public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = userInput.nextInt();
 
        for (int index = 0; index < 11; index++){
		System.out.printf("%d x %d = %d\n",number, index, (number * index));
		} 
	}
}
