public class CheckPalindrome {
	public static char[] palindrome = {'l', 'a', 'g', 'e', 'r', 'r', 'e', 'g', 'a', 'l'};

	public static boolean isPalindrome(char[] arr) {
		if (arr.length % 2 == 1) {
			return false;
		} else {
			for (int i = 0; i < arr.length / 2; i++) {
				if (arr[i] != arr[arr.length - 1 - i]) {
					return false;
				}
			}

			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(palindrome));
	}
}