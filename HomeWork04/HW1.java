import java.util.Scanner;
public class HW1 {
    
    public static int f(int n) {

		if (n == 2) {
			return 2;
		} else {
		    int previous = f(n - 1);
		    int result = n;
			int num = result;
            while (num != 1 && num % 2 == 0) {
                num /= 2;
            }
                System.out.println("<-- Num(" + n + ")" + (num == 1 ? "YES" : "NO"));
            }
		    return n;
		}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        f(n);
    }
}