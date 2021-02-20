import java.util.Scanner;

class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int arraySum = 0;
        
        for (int i = 0; n != 0; i++) {
        	arraySum += n;
        	n = scanner.nextInt ();  
        }

        System.out.println("Total: " + arraySum);
    }
}