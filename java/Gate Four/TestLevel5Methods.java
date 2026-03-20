import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;


class TestLevel5Methods{

    @Test
    void testArrayOfPrimeNumbers() {
        int [] arrayOfNumbers = {5, 9, 3, 6, 2};
        int [] actual = Level5Methods.arrayOfPrimeNumbers(arrayOfNumbers);
        int [] expected = {5, 3, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testArrayOfPrimeNumbersOrdered() {
        int [] arrayOfNumbers = {1,2,3,4,5,6,7,8,9,10};
        int[] actual = Level5Methods.arrayOfPrimeNumbers(arrayOfNumbers);
        int[] expected = {2, 3, 5, 7};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testArrayOfPrimeNumbersWithNegativeNumbers() {
        int [] arrayOfNumbers = {-5, 2, 3, 5, -6, 12, -9, 17};
        int[] actual = Level5Methods.arrayOfPrimeNumbers(arrayOfNumbers);
        int[] expected = {2, 3, 5, 17};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testOnlyPositiveNumbersArray() {
        int [] arrayOfNumbers = {5, -9, 3, -6, 2, -11};
        int[] actual = Level5Methods.onlyPositiveNumbersArray(arrayOfNumbers);
        int[] expected = {5, 0, 3, 0, 2, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testOnlyPositiveNumbersArrayWithOnlyNegativeNumbers() {
        int [] arrayOfNumbers = {-5, -9, -3, -6, -2, -11};
        int[] actual = Level5Methods.onlyPositiveNumbersArray(arrayOfNumbers);
        int[] expected = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testOnlyPositiveNumbersArrayEdgeCases() {
        int [] arrayOfNumbers = {0, -3, 0, -2, 4, 0, -9};
        int[] actual = Level5Methods.onlyPositiveNumbersArray(arrayOfNumbers);
        int[] expected = {0, 0, 0, 0, 4, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testMoveAllZeros() {
        int [] arrayOfNumbers = {5, 0, 3, 0, 2, 0};
        int[] actual = Level5Methods.moveAllZeros(arrayOfNumbers);
        int[] expected = {5, 3, 2, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testMoveAllZerosWithNegativeNumbers() {
        int [] arrayOfNumbers = {-5, -9, 0, -6, -2, 0};
        int[] actual = Level5Methods.moveAllZeros(arrayOfNumbers);
        int[] expected = {-5, -9, -6, -2, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testMoveAllZerosEdgeCases() {
        int [] arrayOfNumbers = {0, 32, 0, 4, 0, 9, 9, 0, 0};
        int[] actual = Level5Methods.moveAllZeros(arrayOfNumbers);
        int[] expected = {32, 4, 9, 9, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testArrayOfDuplicates() {
        int [] arrayOfNumbers = {5, 0, 3, 0, 2, 0};
        int[] actual = Level5Methods.arrayOfDuplicates(arrayOfNumbers);
        int[] expected = {0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testArrayOfDuplicatesTwo() {
        int [] arrayOfNumbers = {45, 60, 3, 0, 67, 2, 45, 3, 22, 0};
        int[] actual = Level5Methods.arrayOfDuplicates(arrayOfNumbers);
        int[] expected = {45, 3, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testArrayOfDuplicatesEdgeCases() {
        int [] arrayOfNumbers = {0, 32, 0, 4, 0, 9, 9, 0, 0};
        int[] actual = Level5Methods.arrayOfDuplicates(arrayOfNumbers);
        int[] expected ={0, 9};
        assertArrayEquals(expected, actual);
    }
}