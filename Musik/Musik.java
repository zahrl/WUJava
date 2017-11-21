public class Musik {
	public static void main(String[] args) {
		Instrument antonio = new Violine("Stradivari");
		String[] song = {"do", "re", "mi", "fa", "sol", "la", "si", "do"};

		antonio.play(song);
	}
}