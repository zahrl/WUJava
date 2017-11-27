public class Swap {
	public static void swap(double[] arr, int i1, int i2) {
		if (i1 > arr.length - 1 || i1 < 0) {
			System.out.println("i1 is out of range!");
		} else if (i2 > arr.length - 1 || i2 < 0) {
			System.out.println("i2 is out of range!");
		}

		double temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}

	public static void main(String[] args) {
		double[] arr = {1.0, 2.0, 3.0, 4.0};
		swap(arr, 0, 3);

		for (double i : arr) {
			System.out.println(i);
		}
	}
}