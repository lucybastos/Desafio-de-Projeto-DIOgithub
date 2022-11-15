package exerciseClasses;

//A java class example - Messages //
public class Messages {
	
	public static void gettingMessage(int hour) {

	switch (hour) {
	
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		goodMorningMessage();
		break;
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
	case 18:
		goodAfternoonMessage();
		break;
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
		goodEveningMessage();
		break;
	case 00:
	case 01:
	case 02:
	case 03:
	case 04:
		goodNightMessage();
		break;
		default:
			System.out.println("Invalid.Type Again.");
			break;
	}
}

	private static void goodNightMessage() {
		System.out.println("Good Nightm, dear.");
		
	}

	private static void goodEveningMessage() {
		System.out.println("Good evening, buddy!");
		
	}

	private static void goodAfternoonMessage() {
		System.out.println("Hello! Good afternoon!");
		
	}

	private static void goodMorningMessage() {
		System.out.println("I got, you`re still tired and sleepy, but good morning, angel.");
		
	}}
