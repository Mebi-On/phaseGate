import java.util.Arrays; 
public class RamadanKareem{
	public static int [] largestInNesstedArray(double [][] nestedArray){
		double largest = 0;
		int [] result = new int[2];
		for (int rowIndex = 0; rowIndex < nestedArray.length; rowIndex ++){
			for (int columnIndex = 0; columnIndex < nestedArray[rowIndex].length; columnIndex ++){ 
				if (nestedArray[rowIndex][columnIndex] > largest){
                			largest = nestedArray[rowIndex][columnIndex];
               				result[0] = rowIndex;
					result[1] = columnIndex; 
				}
			}
		}

    		return result;
	}
	//public static char [] numberOfOccurencesOfUniqueCharactersInAString (String string){
	//	String resultString = "";
	//	for (int stringLettersIndex = 0; stringLettersIndex < string.length(); stringLettersIndex++){
			//if (!resultString.contains(string[stringLettersIndex])){
				//resultString += stringArray[stringLettersIndex];
			//}
		//}
	//	return stringArray;
		
//		}
	}
} 