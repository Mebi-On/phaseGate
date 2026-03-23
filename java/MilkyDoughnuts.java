import java.util.ArrayList;

public class MilkyDoughnuts{
    public static int countEvens(int [] numbers){
        int evenCount = 0;

        for (int number: numbers){
            if (number % 2 == 0){
                evenCount += 1;
            }
        }

        return evenCount;
    }

    public static int linearSearch(int [] numbers, int target){
        for (int index = 0; index < numbers.length; index++){
            if (numbers[index] == target){
                return index;
            }
        }

        return -1;
    }

    public static int [] squares(int numbers){
        if (numbers <= 0){
            return new int[0];
        }

        int[] squaredNumbers = new int[numbers];

        for (int number = 1; number <= numbers; number++){
            squaredNumbers[number - 1] = number * number;
        }

        return squaredNumbers;

    }

    public static boolean arraysEqual(int[] array1, int[] array2){
        if (array1.length != array2.length){
            return false;
        }

        for(int index = 0; index < array1.length; index++){
            if (array1[index] != array2[index]){
                return false;
            }
        }

        return true;
    }


    public static int[] removeDuplicates(int[] numbers){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int number : numbers){
            if (!newArray.contains(number)){
                newArray.add(number);
            }
        }
        return toArray(newArray);
    }

    public static int[] flatten(int [][] matrix){
        ArrayList<Integer> result = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++){
            for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++){
                result.add(matrix[rowIndex][columnIndex]);
            }
        }
        return toArray(result);
    }

    public static int[] intersectOf(int[] array1, int[] array2){
        ArrayList<Integer> intersectElements = new ArrayList<>();
        for (int number1 : array1){
           for (int number2 : array2){
            if (number1 == number2){
                intersectElements.add(number1);
                break;
            }
           }
        }
        return toArray(intersectElements);
    }

    public static int[] toArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];
        for (int index = 0; index < arrayList.size(); index++) {
            array[index] = arrayList.get(index);
        }
        return array;
    }
    // public static void main(String[] args) {
    //     System.out.println(Arrays.toString(squares(-4)));
    // }
}