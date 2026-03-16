import java.util.Scanner;

public class taskSix {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

	System.out.print("Enter the width of your rectangle(cm): ");
	int rectangleWidth = userInput.nextInt();

	System.out.print("Enter the length of your rectangle(cm): ");
	int rectangleLength = userInput.nextInt();

	int area = rectangleWidth * rectangleLength;
	System.out.printf("The are of the rectangle is %d cm^2 \n", area);
    }
}
