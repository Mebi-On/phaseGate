import java.util.Scanner;

public class taskNine {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

	System.out.print("Enter the price of your item: ");
	float itemPrice = userInput.nextFloat();
	
	float tax = itemPrice / 10;

	float total = itemPrice + tax;
	System.out.printf("Your total plus tax is $%.2f \n", total);
    }
}
