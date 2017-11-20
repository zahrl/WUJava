public abstract class Spieler {
	private String name;
	abstract Symbol zug();

	Spieler(String name) {
		this.name = name;
	}

	void setName(String name) {
		this.name = name;
	}
}
