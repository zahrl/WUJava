import java.util.Scanner;

public class Pin {
	private int correctPin = 1234;

	private boolean pinKorrekt(int pin) {
		if (pin == correctPin) {
			return true;
		} else {
			return false;
		}
	}

	static int getPin() {
		System.out.println("Enter PIN:");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Pin p = new Pin();

		for (int i = 0; i < 5; i++) {
			if (p.pinKorrekt(Pin.getPin()) == false) {
				System.out.println("PIN incorrect!");
			} else {
				System.out.println("PIN correct!");
				break;
			}
		}
	}
}