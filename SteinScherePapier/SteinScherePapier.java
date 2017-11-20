public class SteinScherePapier {
	public static final Symbol STEIN = new Symbol("Stein", 1);
	public static final Symbol SCHERE = new Symbol("Schere", 3);
	public static final Symbol PAPIER = new Symbol("Papier", 2);

	public static void main(String[] args) {
		Spieler p1 = new HumanSpieler("SuperMario");
		Spieler p2 = new PCBart();

		spielZug(p1, p2);
	}

	static void spielZug(Spieler p1, Spieler p2) {
		Symbol symb1 = p1.zug();
		Symbol symb2 = p2.zug();

		if (symb1.value == symb2.value) {
			System.out.println("Unentschieden");
		} else if ((symb1.equals(STEIN) && symb2.equals(SCHERE)) || (symb1.equals(PAPIER) && symb2.equals(STEIN)) || (symb1.equals(SCHERE) && symb2.equals(PAPIER))) {
			System.out.println(symb1.name+" schlägt " + symb2.name);
		} else {
			System.out.println(symb2.name+" schlägt " + symb1.name);
		}
	}
}