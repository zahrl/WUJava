import java.util.concurrent.ThreadLocalRandom;

public class HumanSpieler extends Spieler {
	HumanSpieler(String name) {
		super(name);
	}

	Symbol zug() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 4);

		if (randomNum == 1) return SteinScherePapier.STEIN;
		else if (randomNum == 2) return SteinScherePapier.PAPIER;
		else return SteinScherePapier.SCHERE;
	}
}