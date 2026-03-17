
public class Level4Methods{

	public static int addition(int numberOne, int numberTwo){
		return numberOne + numberTwo;
	}
	
	public static String evenCheck(int number){
		if(number % 2 == 0){
			return "Is Even";
		}
		else{
			return "Is Not Even";
		}
	}

	public static int squared (int number){
		return number * number;
	}

	public static double celsiusToFarenheit(int temperature){
		return temperature * 9.0/5.0 + 32.0;
	}
	
	public static boolean isPrime (int number){
		boolean prime = true;
		for (int numbers = 2; numbers < number / 2; numbers++){
			if (number % numbers == 0){
				prime = false;
			}
		}
		return prime;
	}
	
	public static int largestOfThree (int firstNumber, int secondNumber, int thirdNumber){
		int[] listOfNumbers = {firstNumber, secondNumber, thirdNumber};
		int largest = 0;
		for (int numbers: listOfNumbers){
			if (numbers > largest){
				largest = numbers;
			}
		}
		return largest;
	}

	public static double simpleIntrest (int principal, int intrestRate, int time){
		return principal * intrestRate * time * 0.01;
	}
	

	public static void multiplicationTable(int number){
		for(int index = 0; index < 11; index++){
			System.out.printf("%d x %d = %d \n", number, index, (number * index));
		}
	}

	public static int areaOfRectangle(int length, int width){
		return length * width;
	}

	public static int reverseNumber(int number){

		int reversedNumber = 0;
		while(number != 0){
			int lastDigit = number % 10;
			number /= 10;
			reversedNumber *= 10;
			reversedNumber += lastDigit;
		}
		return  reversedNumber;

	}
} 

















