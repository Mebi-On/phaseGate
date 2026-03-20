import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;


class TestLevel6Methods {

    @Test
    void testEvenAndOddLists() {
        int[] arrayOfNumbers = {45, 60, 3, 10, 9, 22};
        int[][] actual = Level6Methods.evenAndOddLists(arrayOfNumbers);
        int[][] expected = {{45, 3, 9}, {60, 10, 22}};

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
    }

    @Test
    void testEvenAndOddListsOrdered() {
        int[] arrayOfNumbers = {1,2,3,4,5,6,7,8,9,10};
        int[][] actual = Level6Methods.evenAndOddLists(arrayOfNumbers);
        int[][] expected = {{1,3,5,7,9}, {2,4,6,8,10}};

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
    }

    @Test
    void testEvenAndOddListsWithNegativeNumbers() {
        int[] arrayOfNumbers = {-5, 2, 3, 5, -6, 12, -9, 17};
        int[][] actual = Level6Methods.evenAndOddLists(arrayOfNumbers);
        int[][] expected = {{-5, 3, 5, -9, 17}, {2, -6, 12}};

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
    }

    @Test
    void testIsListAPalindrome() {
        int[] arrayOfNumbers = {1, 2, 3, 2, 1};
        boolean actual = Level6Methods.isListAPalindrome(arrayOfNumbers);
        assertTrue(actual);
    }

    @Test
    void testIsListAPalindromeWithNegativeNumbers() {
        int[] arrayOfNumbers = {45, 0, 8, 0, 45};
        boolean actual = Level6Methods.isListAPalindrome(arrayOfNumbers);
        assertTrue(actual);
    }

    @Test
    void testIsListAPalindromeEdgeCases() {
        int[] arrayOfNumbers = {4};
        boolean actual = Level6Methods.isListAPalindrome(arrayOfNumbers);
        assertTrue(actual);
    }

    @Test
    void testListOfPerfectSquares() {
        int[] arrayOfNumbers = {4, 7, 9, 10, 16, 18};
        int[] actual = Level6Methods.listOfPerfectSquares(arrayOfNumbers);
        int[] expected = {4, 9, 16};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testListOfPerfectSquaresWithNegativeNumbers() {
        int[] arrayOfNumbers = {20, -100, 24, 144, 69, -36, 0};
        int[] actual = Level6Methods.listOfPerfectSquares(arrayOfNumbers);
        int[] expected = {144, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testListOfPerfectSquaresEdgeCases() {
        int[] arrayOfNumbers = {32, 4, 9, 10, 49, 6};
        int[] actual = Level6Methods.listOfPerfectSquares(arrayOfNumbers);
        int[] expected = {4, 9, 49};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testListOfNonPerfectSquares() {
        int[] arrayOfNumbers = {4, 7, 9, 10, 49, 6};
        int[] actual = Level6Methods.listOfNonPerfectSquares(arrayOfNumbers);
        int[] expected = {4, -1, 9, -1, 49, -1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testListOfNonPerfectSquaresTwo() {
        int[] arrayOfNumbers = {32, 4, 9, 10, 49, 6};
        int[] actual = Level6Methods.listOfNonPerfectSquares(arrayOfNumbers);
        int[] expected = {-1, 4, 9, -1, 49, -1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testListOfNonPerfectSquaresEdgeCases() {
        int[] arrayOfNumbers = {0, 36, 0, 16, 0, 9, 7};
        int[] actual = Level6Methods.listOfNonPerfectSquares(arrayOfNumbers);
        int[] expected = {0, 36, 0, 16, 0, 9, -1};

        assertArrayEquals(expected, actual);
    }
}