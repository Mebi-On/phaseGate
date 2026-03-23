
//Create a loop for the number of questions
//Create variables for the score, number of questions and attempts made
//Generate 2 random variable, and check if valid
//If the second variable is greater than the first, it does not count as a question
//Create a loop so for if the answer is correct or incorrect
//For valid questions prompt the user to give an answer
//If the user get the question correct print correct answer, end loop and increase score by 1
//If user gets the question incorrect re-prompts the user, they have two attempts 
//If the user fails both attempts it moves to the next question and they score 0 for that question
//Print the users final score


import java.util.Random;
import java.util.Scanner;

public class SimpleArithmeticApp{
	
	public static void main (String[] args){
		Random random = new Random();
		Scanner userInput = new Scanner(System.in);
		int numberOfQuestions = 10;
		int questionNumber = 0;
		int score = 0;

		while ( questionNumber < numberOfQuestions ){
			int attempts = 0;
			int firstNumber = random.nextInt(1, 100);
			int secondNumber = random.nextInt(1, 100);

			if (firstNumber > secondNumber){
				int answer = firstNumber - secondNumber;
				questionNumber ++;
				System.out.printf("%d - %d = ", firstNumber, secondNumber);

				while (attempts < 2 ){
					int userAnswer = userInput.nextInt();

					if ( userAnswer == answer ){
						System.out.print("Correct answer\n");
						attempts = 3;
						score ++;
						break;
					}
					else if ( userAnswer != answer && attempts < 1){
						System.out.print("Incorrect answer, 1 more try \n"); 
						attempts += 1;
						continue;
					}
					else if ( userAnswer != answer && attempts < 2){
						System.out.print("Incorrect answer, out of trys \n"); 
						attempts += 1;
						break;
					}
				}
			}
		}
		System.out.print(score + " / 10 \n");
	}
}  
