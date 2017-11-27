public abstract class Waehrung {
	abstract double dollarBetrag();

	public void print() {
		System.out.println(dollarBetrag() + " $");
	}
}