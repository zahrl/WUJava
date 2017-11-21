public class Violine extends Saiteninstrument {
	Violine(String name) {
		this.name = name;
	}
	
	void play(String[] noten) {
		System.out.println("Listen to my " + this.name + ":");

		for (int i = 0; i < noten.length; i++) {
			if (i % 3 == 0) {
				System.out.println("squeaky " + noten[i]);
			} else {
				System.out.println(noten[i]);
			}
		}
	}
}