public class Euro extends Waehrung {
	double amount = 0.0;
	static final double conversionRate = 1.0714;

	Euro(double d) {
		this.amount = d;
	}

	double dollarBetrag() {
		return this.amount * Euro.conversionRate;
	}
}