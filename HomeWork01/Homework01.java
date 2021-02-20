// Задание 1.
// Реализовать приложение, которое выводит сумму цифр пятизначного числа (значение числа
// задается непосредственно в коде).
// ● В данном задании запрещено использование циклов и массивов.

class Homework01 {
	public static void main(String args[]) {
		int number = 12345;
		int number1 = number % 10;
		int number2 = number / 10 % 10;
		int number3 = number / 100 % 10;
		int number4 = number / 1_000 % 10;
		int number5 = number / 10_000 % 10;
		int digitsSum = number1 + number2 + number3 + number4 + number5;

		System.out.println(digitsSum);
	}
}