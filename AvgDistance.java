class AvgDistance {
	public double avgDistance(double[] arr) {
		double diff = 0.0;

		for (int i = arr.length-1; i > 0; i--) {
			diff += arr[i]-arr[i-1];
		}

		return diff/(arr.length-1);
	}

	public static void main(String[] args) {
		double[] arr = {0.4, 1.6, 2.0, 2.1, 4.5};
		
		AvgDistance a1 = new AvgDistance();
		System.out.println(a1.avgDistance(arr));
	}
}