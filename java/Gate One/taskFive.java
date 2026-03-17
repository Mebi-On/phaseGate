import java.util.Scanner;

public class TaskFive{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
	System.out.print("Enter the temperature in Celsius: ");
	float celsiusTemp = userInput.nextFloat();
	
	float fahrenheit = celsiusTemp * 9/5 + 32;
	System.out.printf("The temperature is %.2fF \n", fahrenheit);
    }
}
