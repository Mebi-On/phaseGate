import java.util.ArrayList;

public class Level5Methods {
    public static int[] arrayOfPrimeNumbers(int[] arrayOfNumbers) {
       ArrayList<Integer> arrayOfPrimeNumbers = new ArrayList<>();
       for (int index = 0; index < arrayOfNumbers.length; index++) {
            if (arrayOfNumbers[index] > 1) {
               boolean isPrime = true;
               for (int divisor = 2; divisor < arrayOfNumbers[index]; divisor++) {
                   if (arrayOfNumbers[index] % divisor == 0) {
                       isPrime = false;
                       break;
                   }
               }
               if (isPrime){
                arrayOfPrimeNumbers.add(arrayOfNumbers[index]);
               }
            }
            
        }
        
        int [] result = new int[arrayOfPrimeNumbers.size()];
        for (int index = 0; index < arrayOfPrimeNumbers.size(); index++){
            result[index] = arrayOfPrimeNumbers.get(index);
        }
        
        return result;
    }

    public static int[] onlyPositiveNumbersArray(int[] arrayOfNumbers) {
        int[] result = new int[arrayOfNumbers.length];

        for (int index = 0; index < arrayOfNumbers.length; index++) {
            if (arrayOfNumbers[index] < 0) {
                result[index] = 0;
            } 
            else {
                result[index] = arrayOfNumbers[index];
            }
        }
        return result;
    }

    public static int[] moveAllZeros(int[] arrayOfNumbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            if (arrayOfNumbers[index] != 0) {
                result.add(arrayOfNumbers[index]);
            }
        }

        int zeroCount = arrayOfNumbers.length - result.size();
        for (int index = 0; index < zeroCount; index ++) {
            result.add(0);
        }

        int [] new_result = new int[result.size()];
        for (int index = 0; index < result.size(); index++){
            new_result[index] = result.get(index);
        }
    
        return new_result;
    }

    public static int[] arrayOfDuplicates(int[] arrayOfNumbers) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int index = 0; index < arrayOfNumbers.length; index++) {
            int count = 0;

            for (int secondIndex = 0; secondIndex < arrayOfNumbers.length; secondIndex++) {
                if (arrayOfNumbers[index] == arrayOfNumbers[secondIndex]) {
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains(arrayOfNumbers[index])) {
                duplicates.add(arrayOfNumbers[index]);
            }
        }

        int [] result = new int[duplicates.size()];
        for (int index = 0; index < duplicates.size(); index++){
            result[index] = duplicates.get(index);
        }
        
        return result;
    }

}