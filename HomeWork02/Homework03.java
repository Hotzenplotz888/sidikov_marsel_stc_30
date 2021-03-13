//Задание 3.
//Реализовать приложение, которое вычисляет среднее арифметическое элементов массива
//(массив вводится с клавиатуры - по одному в каждой новой строке).

import java.util.Scanner;

class Homework03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		double arrAvg = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
			arrAvg += array[i];
		}
		arrAvg /= n;
        System.out.println(arrAvg);
	}
}