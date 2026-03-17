import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TestLevel4Methpds {

    @Test
    public void testAdditionWithPositiveNumbers() {
	int actual = Level4Methods.addition(3, 4);
	assertEquals(actual, 7);
	}

    @Test
    public void testAdditionWithNegativeNumbers() {
	int actual = Level4Methods.addition(-3, 4);
	assertEquals(actual, 1);
	}

    @Test
    public void testEvenCheckWithNonEvenNumbers() {
	String actual = Level4Methods.evenCheck(7);
	assertEquals(actual, "Is Not Even");
	}

    @Test
    public void testEvenCheckWithEvenNumbers() {
	String actual = Level4Methods.evenCheck(4);
	assertEquals(actual, "Is Even");
	}
    
    @Test
    public void testSquaredWithPositiveNumbers() {
	int actual = Level4Methods.squared(7);
	assertEquals(actual, 49);
	}

    @Test
    public void testSquaredWithNegativeNumbers() {
	int actual = Level4Methods.squared(4);
	assertEquals(actual, 16);
	}
  
    @Test
    public void testCelsiusToFarenheitOne() {
	double actual = Level4Methods. celsiusToFarenheit(1);
	assertEquals(actual, 33.8);
	}

    @Test
    public void testCelsiusToFarenheitTwo() {
	double actual = Level4Methods.celsiusToFarenheit(20);
	assertEquals(actual, 68.0);
	}

    @Test
    public void testIsPrimeWithKnownRandomNumbers() {
	boolean actual = Level4Methods.isPrime(17);
	assertTrue(actual, "true");
	}

    @Test
    public void testIsPrimeWithKnownPrimeNumbers() {
	boolean actual = Level4Methods.isPrime(1774567);
	assertFalse(actual, "false");
	}

    @Test
    public void testLargestOfThreeOne() {
	int actual = Level4Methods.largestOfThree(20, 23, 76);
	assertEquals(actual, 76);
	}

    @Test
    public void tesLargestOfThreeTwo() {
	int actual = Level4Methods.largestOfThree(7, 3, 12);
	assertEquals(actual, 12);
	}
	
    @Test
    public void testSimpleIntrestOne() {
	double actual = Level4Methods.simpleIntrest(1200, 12, 5);
	assertEquals(actual, 720);
	}

    @Test
    public void testSimpleIntrestTwo() {
	double actual = Level4Methods.simpleIntrest(6_000_000, 21, 10);
	assertEquals(actual, 12_600_000);
	}


    @Test
    public void testAreaOfRectangleOne() {
	double actual = Level4Methods.areaOfRectangle(12, 20);
	assertEquals(actual, 240);
	}

    @Test
    public void testAreaOfRectangleTwo() {
	double actual = Level4Methods.areaOfRectangle(7, 3);
	assertEquals(actual, 21);
	}

     @Test
    public void testReverseNumberOne() {
	int actual = Level4Methods.reverseNumber(122);
	assertEquals(actual, 221);
	}

    @Test
    public void testReverseNumberTwo() {
	int actual = Level4Methods.reverseNumber(123);
	assertEquals(actual, 321);
	}

}




