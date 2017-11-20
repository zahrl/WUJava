public class PCBart extends Spieler {
	PCBart() {
		super("Bart");
	}

	Symbol zug() {
		return SteinScherePapier.STEIN;
	}
}