import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMilkyDoughnuts {

    @Test
    void testCountEvens() {
        int[] numbers = {5, 9, 3, 6, 2};
        int actual = MilkyDoughnuts.countEvens(numbers);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void testCountEvensOrdered() {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int actual = MilkyDoughnuts.countEvens(numbers);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void testCountEvensWithNegativeNumbers() {
        int[] numbers = {-5, 2, 3, 5, -6, 12, -9, 17};
        int actual = MilkyDoughnuts.countEvens(numbers);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void testLinearSearchPositive() {
        int[] numbers = {5, -9, 3, -6, 2, -11};
        int actual = MilkyDoughnuts.linearSearch(numbers, 2);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void testLinearSearchNegative() {
        int[] numbers = {-5, -9, -3, -6, -2, -11};
        int actual = MilkyDoughnuts.linearSearch(numbers, -2);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void testLinearSearchEdgeCases() {
        int[] numbers = {0, -3, 0, -2, 4, 0, -9};
        int actual = MilkyDoughnuts.linearSearch(numbers, -3);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void testSquares() {
        int[] actual = MilkyDoughnuts.squares(5);
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSquaresNegative() {
        int[] actual = MilkyDoughnuts.squares(-4);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSquaresEdgeCase() {
        int[] actual = MilkyDoughnuts.squares(0);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testArraysEqual() {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        boolean actual = MilkyDoughnuts.arraysEqual(array1, array2);
        assertTrue(actual);
    }

    @Test
    void testArraysEqualTwo() {
        int[] array1 = {};
        int[] array2 = {};
        boolean actual = MilkyDoughnuts.arraysEqual(array1, array2);
        assertTrue(actual);
    }

    @Test
    void testArraysEqualEdgeCase() {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,4,3,2,1};
        boolean actual = MilkyDoughnuts.arraysEqual(array1, array2);
        assertFalse(actual);
    }

    @Test
    void testRemoveDuplicates() {
        int[] numbers = {1,2,3,4,5,1,2,3};
        int[] actual = MilkyDoughnuts.removeDuplicates(numbers);
        int[] expected = {1,2,3,4,5};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesNegative() {
        int[] numbers = {-1,-2,-3,-1,-2};
        int[] actual = MilkyDoughnuts.removeDuplicates(numbers);
        int[] expected = {-1,-2,-3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRemoveDuplicatesEdge() {
        int[] numbers = {};
        int[] actual = MilkyDoughnuts.removeDuplicates(numbers);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFlattenSameLength() {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] expected = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expected, MilkyDoughnuts.flatten(matrix));
    }

    @Test
    void testFlattenDifferentLengths() {
        int[][] matrix = {{1,2,3}, {4,5,6,7}, {8,9,10}};
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(expected, MilkyDoughnuts.flatten(matrix));
    }

    @Test
    void testFlattenEdgeCase() {
        int[][] matrix = {{-43,6,20,12}, {1,90}, {17,81,-5,0,3}, {4,5,6,7,8,9}};
        int[] expected = {-43,6,20,12,1,90,17,81,-5,0,3,4,5,6,7,8,9};
        assertArrayEquals(expected, MilkyDoughnuts.flatten(matrix));
    }

    @Test
    void testIntersectOf() {
        int[] array1 = {1,2,3,5,4,7};
        int[] array2 = {7,2,1,6,9};

        int[] actual = MilkyDoughnuts.intersectOf(array1, array2);
        int[] expected = {1,2,7};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testIntersectOfTwo() {
        int[] array1 = {10,2,23,5,-14};
        int[] array2 = {12,32,5,89,29};

        int[] actual = MilkyDoughnuts.intersectOf(array1, array2);
        int[] expected = {5};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testIntersectOfEdgeCases() {
        int[] array1 = {};
        int[] array2 = {};

        int[] actual = MilkyDoughnuts.intersectOf(array1, array2);
        int[] expected = {};

        assertArrayEquals(expected, actual);
    }
}