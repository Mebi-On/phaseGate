import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MiniParkingSystem {


	public static int [] generateParkingArray(){
		Random random = new Random();
		int [] availableParkingSpots = new int [20];
		int numberOfUnavailableParking = random.nextInt(7) + 10;

		for (int parkingSpot = 0; parkingSpot < numberOfUnavailableParking; parkingSpot++){
			int parkingSpotIndex = random.nextInt(20);
			if (availableParkingSpots[parkingSpotIndex] == 0){
				availableParkingSpots[parkingSpotIndex] = 1;
			}
		}
		return availableParkingSpots;
	}

	public static int getAssignedParking(int[] availableParkingSpots){
		int parkingIndex = -1;
		for (parkingIndex = 0; parkingIndex < 20; parkingIndex++){
			if (availableParkingSpots[parkingIndex] == 0){
				System.out.printf("You are Now parked in slot %d\n", (parkingIndex + 1));
						availableParkingSpots[parkingIndex] = 1;
						break;
			}
		}
		return parkingIndex + 1;
	}

	public static int chooseParking (int[] availableParkingSpots){
		Scanner input = new Scanner(System.in);
		boolean unavailable = true;
		int userInput = 0;
		while (unavailable){
			System.out.print("Enter which slot you want to park in (1 - 20): ");
			userInput = input.nextInt();
			if (availableParkingSpots[userInput -  1] != 0){
				System.out.println("Parking space is unavailable. Enter another space (1 - 20): ");
			}
			else{
				availableParkingSpots[userInput - 1] = 1;
				System.out.printf("You are Now parked in slot %d\n", userInput);
				unavailable = false;
			}
		}
		return userInput;
	
	}

	public static int unPark(int[] availableParkingSpots){
		Scanner input = new Scanner(System.in);
		boolean available = true;
		int userNumber = 0;
		while (available){
			System.out.print("Enter which slot you want to unpark from (1 - 20): ");
			userNumber = input.nextInt();
			if (availableParkingSpots[userNumber - 1] == 0) {
				System.out.print("Parking space is available. You arent parked here. \nEnter another space (1 - 20): ");
			}
			else{
				availableParkingSpots[userNumber - 1] = 0;
				System.out.printf("You are now unparked from slot %d\n", userNumber);
				available = false;
			}
		}
		return userNumber;
	}
	
	public static int [] printAvailableParking(int[] availableParkingSpots){
		ArrayList<Integer> availableSlots = new ArrayList<> ();
		for (int parkingIndex = 0; parkingIndex < 20; parkingIndex++){
			if (availableParkingSpots[parkingIndex] == 0){
				availableSlots.add(parkingIndex + 1);
			}
		}
		return toArray(availableSlots);
	}

	public static int [] printUnavailableParking(int[] availableParkingSpots){
		ArrayList<Integer> unAvailableSlots = new ArrayList<> ();
		for (int parkingIndex = 0; parkingIndex < 20; parkingIndex++){
			if (availableParkingSpots[parkingIndex] == 1){
				unAvailableSlots.add(parkingIndex + 1);
			}
		}
		return toArray(unAvailableSlots);
	}

	public static int[] toArray(ArrayList<Integer> arrayList) {
		int[] array = new int[arrayList.size()];
		for (int index = 0; index < arrayList.size(); index++) {
			array[index] = arrayList.get(index);
		}
		return array;
	}

}