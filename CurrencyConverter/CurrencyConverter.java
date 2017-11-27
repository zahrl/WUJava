public class CurrencyConverter {
	public static void main(String[] args) {
		Euro e = new Euro(1000);
		e.print();

		Yen y = new Yen(1000);
		y.print();
	}
}