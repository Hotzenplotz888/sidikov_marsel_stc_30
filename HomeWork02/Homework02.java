import java.util.Scanner;
import java.util.Arrays;

class Homework02 {
	public static void main(String[] args) {
		System.out.println("Enter number (first enter the # of numbers you need):");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
		System.out.println(Arrays.toString(array));
		 // выводится массив в зеркальном представлении
	}
}