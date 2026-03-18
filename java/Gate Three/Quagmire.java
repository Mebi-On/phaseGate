public class Quagmire{
	public static int[] specifyListLength(int[] arrayOfNumbers, int lengthOfNewArray){
		int [] newArray = new int[lengthOfNewArray];
		int lengthOfArrayOfNumbers = arrayOfNumbers.length;
		for (int index = 0; index < lengthOfNewArray; index++){
			if (index < lengthOfArrayOfNumbers){
				newArray[index] = arrayOfNumbers[index];
			}
			else{
				newArray[index] = -1;
			}
		}
		return newArray;
	}
} 