import java.util.Scanner; 
import java.util.Random;

public class NumberGuessingApp{

	public static int randomNumberGenerator(){
		Random random = new Random();
		return (random.nextInt(1, 101));
	}

	public static String trackAndDisplayRating(int attempts){
		if (attempts == 1){
			return "Legendary";
		}
		else if (attempts == 2){
		  	return "Excellent";
		}
		else if (attempts == 3 || attempts == 4){
		  	return "Good";
		}
		else if (attempts == 5){
		  	return "Close!";
		}
		else {
		  	return "Better luck";
		}
	}

	public static boolean inputValidator(Scanner userInput){
		
        	boolean isValid = true;
        	while (isValid) { 
            		if (userInput.hasNextInt()) {
                		int value = userInput.nextInt();
            
                		if (value >= 1 && value <= 100) {
					isValid = true;
					return isValid;
                		} 
				else {
                    			System.out.print("Out of range, Try again: ");
					isValid = false;
                		}
            		} 	
			else {
				isValid = false;
                		System.out.print("Invalid input. Try again: ");
                		userInput.next();
           		}
        	}
        	return isValid;
	}

	public static void main (String [] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print(inputValidator(userInput));
	}
} 