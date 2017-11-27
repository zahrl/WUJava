public class Yen extends Waehrung {
	private final double amount;
	static final double conversionRate = 0.0092;

	Yen(double d) {
		this.amount = d;
	}

	double getAmount() {
		return this.amount;
	}

	double dollarBetrag() {
		return getAmount() * conversionRate;
	}
}