import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class TestRemoveDuplicatesMethod{

    @Test
    void testRemoveDuplicatesFromArray() {
        int [] arrayOfNumbers = {1, 2, 3, 3, 4};
        int [] actual = RemoveDuplicatesMethod.removeDuplicatesFromArray(arrayOfNumbers);
        int [] expected = {1, 2, 4};

        assertArrayEquals(expected, actual);
   
    }

    @Test
    void testRemoveDuplicatesFromArrayTwo() {
        int [] arrayOfNumbers = {1, 2, 3, 2, 4};
        int [] actual = RemoveDuplicatesMethod.removeDuplicatesFromArray(arrayOfNumbers);
        int [] expected = {1, 3, 4};

        assertArrayEquals(expected, actual);
   
    }

   @Test
    void testRemoveDuplicatesFromArrayNoDuplicates() {
        int [] arrayOfNumbers = {1, 2, 3, 4, 5};
        int [] actual = RemoveDuplicatesMethod.removeDuplicatesFromArray(arrayOfNumbers);
        int [] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, actual);
   
    }

   @Test
    void testRemoveDuplicatesFromArrayAllDuplicates() {
        int [] arrayOfNumbers = {1, 1, 2, 2, 3, 3, 4, 4};
        int [] actual = RemoveDuplicatesMethod.removeDuplicatesFromArray(arrayOfNumbers);
        int [] expected = {};

        assertArrayEquals(expected, actual);
   
    }
}