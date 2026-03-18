import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class TestRamadanKareem{

    @Test
    public void testNumberOfOccurencesOfUniqueCharactersInAStringOne() {
	String string = "A";
	String actual = RamadanKareem.numberOfOccurencesOfUniqueCharactersInAString(string);
	String expected = "A1";
	assertEquals(actual, expected);
	}



    @Test
    public void testLargestInNestedListIntsOnly() {
	double [] [] nestedArray = {{10, 11, 12}, {13, 14, 15}, {20, 17, 18}};
        int [] expected = {2, 0};
	int [] actual = RamadanKareem.largestInNesstedArray(nestedArray);
	assertArrayEquals(actual, expected);
	}

    @Test
    public void testLargestInNestedListFloatsOnly() {
	double [] [] nestedArray = {{2.3, 23.9, 24.0}, {43.5, 3.99, 7.7, 15.9}, {2.0, 34.8, 43.59}};
        int [] expected = {2, 2};
	int [] actual = RamadanKareem.largestInNesstedArray(nestedArray);
	assertArrayEquals(actual, expected);
	}

    @Test
    public void testLargestInNestedListIntsAndFloats() {
	double [] [] nestedArray = {{10, 33.3, 54}, {10, 43.7, 88}, {21, 54, 6.5}};
        int [] expected = {1, 2};
	int [] actual = RamadanKareem.largestInNesstedArray(nestedArray);
	assertArrayEquals(actual, expected);
	}
	
     @Test
    public void testLargestInNestedListUnevenLists() {
	double [] [] nestedArray = {{10, 11, 12}, {13, 14, 15, 77}, {20, 17, 18}};
        int [] expected = {1, 3};
	int [] actual = RamadanKareem.largestInNesstedArray(nestedArray);
	assertArrayEquals(actual, expected);
	}
	
}