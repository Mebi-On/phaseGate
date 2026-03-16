import java.util.Scanner;

public class taskOne  {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String userName = userInput.nextLine();
	System.out.printf("Welcome to Level one %s \n", userName);
    }
}
