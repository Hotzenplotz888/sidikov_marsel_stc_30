import java.util.Scanner;
import java.util.Arrays;

class Homework02 {
	public static void main(String args[]) {
		System.out.println("Enter number (first enter the amount of numbers you wish to display):");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(array));	
		 // выводится массив в зеркальном представлении
	}
}