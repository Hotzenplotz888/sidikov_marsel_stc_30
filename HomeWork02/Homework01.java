import java.util.Scanner;

class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int arraySum = 0;
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt ();
            arraySum += array[i];
        }

        System.out.println("Total: " + arraySum);
    }
}