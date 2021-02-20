// Задание 2.
// Реализовать приложение, которое выводит двоичное представление пятизначного числа
// (значение числа задается непосредственно в коде).
// ● В данном задании запрещено использование циклов и массивов.

class Homework02{

     public static void main(String []args){
        int number = 12345;
        long BASE = 10;
        System.out.println("BinNumCheck: " + Integer.toBinaryString(number));
        
        long binaryNumber = number % 2;//1
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//2
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//3
        number /= 2;
        binaryNumber += number % 2 * BASE;//4
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//5
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//6
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//7
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//8
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//9
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//10
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//11
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//12
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//13
        number /= 2;
        BASE *= 10;
        binaryNumber += number % 2 * BASE;//14
        number /= 2;
        BASE *= 10;

        System.out.println("Total: " + binaryNumber);
     }
}