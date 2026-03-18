import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestQuagmire {

    @Test
    public void testSpecifyListLengthToAGreaterNumbers() {
	int [] array = {1, 2, 3};
	int[] actual = Quagmire.specifyListLength(array, 5);
	int[] expected = {1, 2, 3, -1, -1};
	assertArrayEquals(actual, expected);
	}
	
   @Test
    public void testSpecifyListLengthToALesserNumbers() {
	int [] array = {1, 2, 3, 4, 5, 6};
	int[] actual = Quagmire.specifyListLength(array, 3);
	int[] expected = {1, 2, 3};
	assertArrayEquals(actual, expected);
	}

   @Test
    public void testSpecifyListLengthEdgeCase() {
	int [] array = {};
	int[] actual = Quagmire.specifyListLength(array, 7);
	int[] expected = {-1, -1, -1, -1, -1, -1, -1};
	assertArrayEquals(actual, expected);
	}
}