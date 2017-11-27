public class SuperMario {
	final static int left = -1;
	final static int right = 1;
	final static int stop = 0;

	int x;
	int y;
	int maxX;
	int maxY;
	int minX;
	int minY;

	public SuperMario(int x, int y) {
		this.x = x;
		this.y = y;

		this.outputCurrentLocation();
	}

	void move(int direction) {
		if (direction == right && this.x < maxX) {
			this.x++;
		} else if (direction == left && this.x > minX) {
			this.x--;
		} else {
			System.out.println("Cannot move in the specified direction!");
		}

		this.outputCurrentLocation();
	}

	void jump(int direction) {
		if (this.y < maxY) {
			this.y++;
			if (direction == left) {
				move(left);
			} else if (direction == right) {
				move(right);
			} else {
				System.out.println("Cannot move in the specified direction!");
			}
		}
	}

	void fall(int direction) {
		if (this.y > minY) {
			this.y--;
			if (direction == left) {
				move(left);
			} else if (direction == right) {
				move(right);
			} else {
				System.out.println("Cannot move in the specified direction!");
			}
		}
	}

	void outputCurrentLocation() {
		System.out.println("Current location: x = " + this.x + ", y = " + this.y);
	}

	public static void main(String[] args) {
		SuperMario test = new SuperMario(2, 3);
		test.minX = 0;
		test.minY = 0;
		test.maxX = 10;
		test.maxY = 10;
		test.jump(right);
		for (int i = 0; i < 10; i++) {
			test.move(right);
		}
		test.move(right);
		test.move(right);
	}
}