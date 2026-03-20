import java.util.ArrayList;

public class Level6Methods {

    public static int[][] evenAndOddLists(int[] listOfNumbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int index = 0; index < listOfNumbers.length; index++) {
            if (listOfNumbers[index] % 2 == 0) {
                evenList.add(listOfNumbers[index]);
            } else {
                oddList.add(listOfNumbers[index]);
            }
        }

        int[] oddArray = toArray(oddList);
        int[] evenArray = toArray(evenList);

        return new int[][]{oddArray, evenArray};
    }

    public static boolean isListAPalindrome(int[] listOfNumbers) {
        for (int index = 0; index < listOfNumbers.length; index++) {
            if (listOfNumbers[index] != listOfNumbers[listOfNumbers.length - 1 - index]) {
                return false;
            }
        }
        return true;
    }

    public static int[] listOfPerfectSquares(int[] listOfNumbers) {
        ArrayList<Integer> squares = new ArrayList<>();

        for (int index = 0; index < listOfNumbers.length; index++) {
            if (listOfNumbers[index] < 0) continue;

            double val = Math.sqrt(listOfNumbers[index]);

            if (val == (int) val) {
                squares.add(listOfNumbers[index]);
            }
        }

        return toArray(squares);
    }

    public static int[] listOfNonPerfectSquares(int[] listOfNumbers) {
        int[] result = new int[listOfNumbers.length];

        for (int index = 0; index < listOfNumbers.length; index++) {
            double val = Math.sqrt(listOfNumbers[index]);

            if (val != (int) val) {
                result[index] = -1;
            } else {
                result[index] = listOfNumbers[index];
            }
        }

        return result;
    }

    public static int[] toArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];
        for (int index = 0; index < arrayList.size(); index++) {
            array[index] = arrayList.get(index);
        }
        return array;
    }
    
}