import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class TestMiniParkingSystem {

    @Test
    void testChooseParking() {
        int[] availableParkingSpots = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1};
        int actual = MiniParkingSystem.chooseParking(availableParkingSpots);
        int expected = 5;

        assertEquals(expected, actual);
   
    }
	
    @Test
    void testGetAssignedParking() {
        int[] availableParkingSpots = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1};
        int actual = MiniParkingSystem.getAssignedParking(availableParkingSpots);
        int expected = 1;

        assertEquals(expected, actual);
   
    }

    @Test
    void testUnPark() {
        int [] availableParkingSpots = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1};
        int actual = MiniParkingSystem.unPark(availableParkingSpots);
        int expected = 2;
        assertEquals(expected, actual);
   
    }

    @Test
    void testPrintAvailableParking() {
        int [] availableParkingSpots = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1};
        int [] actual = MiniParkingSystem. printAvailableParking(availableParkingSpots);
        int [] expected = {1, 5, 6, 8, 10, 14, 15, 16, 17, 18};

        assertArrayEquals(expected, actual);
   
    }

    @Test
    void testPrintUnavailableParking() {
        int [] availableParkingSpots = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1};
        int [] actual = MiniParkingSystem. printUnavailableParking(availableParkingSpots);
        int [] expected = {2, 3, 4, 7, 9, 11, 12, 13, 19, 20};

        assertArrayEquals(expected, actual);
   
    }

  }