import java.util.ArrayList;
import java.util.Arrays; 
 
public class RemoveDuplicatesMethod{
	public static int [] removeDuplicatesFromArray (int [] arrayOfNumbers){
		ArrayList<Integer> result = new ArrayList<> ();
		for (int firstIndex = 0; firstIndex < arrayOfNumbers.length; firstIndex++){
			int count = 0;
			for (int secondIndex = 0; secondIndex < arrayOfNumbers.length; secondIndex++){
				
				if (arrayOfNumbers[firstIndex] == arrayOfNumbers[secondIndex]){
					count ++;
				}
			}
			if (count == 1){
				result.add(arrayOfNumbers[firstIndex]);
			}
			
		}
		int [] array = new int[result.size()];
		for (int index = 0; index < result.size(); index++){
			array[index] = result.get(index);
		} 
	return array;
	}

} 