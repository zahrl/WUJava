class sum {
	int method_a(int n) {
		int sum = 0;
		for (int i = 0; i < n + 1; i++) {
			sum += i;
		}
		return sum;
	}

	int method_b(int n) {
		int sum = 0;
		int i = 0;

		while (i <= n) {
			sum += i;
			i++;
		}

		return sum;
	}

	int method_c(int n) {
		if (n == 0) return 0;
		return n + method_c(n-1);
	}

	public static void main(String[] args) {
		sum s = new sum();

		assert(s.method_a(20) == 210);
		assert(s.method_b(20) == 210);
		assert(s.method_c(20) == 210);
	}
}