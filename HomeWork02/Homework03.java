//Задание 3.
//Реализовать приложение, которое вычисляет среднее арифметическое элементов массива
//(массив вводится с клавиатуры - по одному в каждой новой строке).

import java.util.Scanner;

class Homework03 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		double arrAvg = 0;
		int nNum = 0;
        for (int i = 0; n != 0; i++) {
        	arrAvg += n;
        	nNum++;
        	n = scanner.nextInt();	
        	}
        arrAvg /= nNum;
        System.out.println(arrAvg);
	}
}