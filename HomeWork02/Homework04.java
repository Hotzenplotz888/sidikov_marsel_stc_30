import java.util.Scanner;
import java.util.Arrays;

class Homework04 {
	public static void main(String[] args) {
		System.out.println("Enter number (first enter the # of numbers you need):");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int numbers[] = new int[n];

		for (int j = 0; j < numbers.length; j++) {
				numbers[j] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(numbers));

		int min = numbers[0];
		int positionOfMin = 0;
		int max = numbers[0];
		int positionOfMax = 0;

		for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] < min) {
				min = numbers[i];
				positionOfMin = i;
				}
				if (numbers[i] > max) {
				max = numbers[i];
				positionOfMax = i;
				}
		}
		
		System.out.println(min);
		System.out.println(positionOfMin);
		System.out.println(max);
		System.out.println(positionOfMax);

		int temp = numbers[positionOfMin];
		numbers[positionOfMin] = numbers[positionOfMax];
		numbers[positionOfMax] = temp;
		System.out.println(Arrays.toString(numbers));
    }
}