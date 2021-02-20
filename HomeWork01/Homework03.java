// Задание 3.
// Реализовать приложение, которое для заданной последовательности чисел считает
// произведение тех чисел, сумма цифр которых - простое число. Последнее число
// последовательности - 0.
// Пример входных данных:

//119 ​ (сумма цифр - 11, простое число)
//33542 ​ (сумма цифр - 17, простое число)
//99 ​ (сумма цифр - 18, составное число)
//991 ​ (сумма цифр - 19, составное число)
//0 ​ (последнее число последовательности)
//Ответ: 119 * 33542 = 3991498

import java.util.Scanner;

class Homework03 {

     public static void main(String[] args){
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();
        int digitsCompo = 1;
        while (currentNumber != 0) {
            int digitsSum = 0;
            int copyNumber = currentNumber;
            while (copyNumber != 0) {
                digitsSum += copyNumber % 10;
                copyNumber /= 10;
            }
            boolean isPrime = true;
            for (int i = 2; i < digitsSum; i++) {
                if (digitsSum % i == 0) {
                    isPrime = false;
                	break;
                }
                        
            }
            if (isPrime) {
                digitsCompo *= currentNumber;
            }
           currentNumber = scanner.nextInt ();  
        }
        System.out.println(digitsCompo);
     }
}


