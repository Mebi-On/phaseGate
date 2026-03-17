import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

	System.out.print("Enter the radius of the circle (cm): ");
	int circleRadius = userInput.nextInt();

	double circumference =  2 * 3.14159265 * circleRadius;
	System.out.printf("The circumference of your circle is %.2f cm^2 \n", circumference);
    }
}
