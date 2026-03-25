import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Scanner; 


class TestNumberGuessingApp {

    @Test
    void testRandomNumberGenerator() {

        boolean actual = (NumberGuessingApp.randomNumberGenerator() <= 100 && NumberGuessingApp.randomNumberGenerator() >= 1);
        assertTrue(actual);
  
    }

    @Test
    void testTrackAndDisplayRatingOne() {

        String actual = NumberGuessingApp.trackAndDisplayRating(2);
	String expected = "Excellent";
        assertEquals(actual, expected);
  
    }
    @Test
    void testTrackAndDisplayRatingTwo() {

        String actual = NumberGuessingApp.trackAndDisplayRating(3);
	String expected = "Good";
        assertEquals(actual, expected);
  
    }

    @Test
    void testTrackAndDisplayRatingFail() {

        String actual = NumberGuessingApp.trackAndDisplayRating(6);
	String expected = "Better luck";
        assertEquals(actual, expected);
  
    }

    @Test
    void testInputValidator() {
	Scanner userInput = new Scanner(System.in);
        boolean actual = NumberGuessingApp.inputValidator(userInput);
        assertTrue(actual);
  
    }
}
