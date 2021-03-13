import java.util.Scanner;
class Homework07 {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int m = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int n = scanner.nextInt();
		
		int[][] array = new int[m][n];
		int s = 1;

		int c = 1;
	    int d = 1;
	 
	    while (s < m * n) {

	        while (array[c][d + 1] == 0) {
	            array[c][d] = s;
	            s++;
	            d++;
	        }

	        while (array[c + 1][d] == 0) {
	            array[c][d] = s;
	            s++;
	            c++;
	        }

	        while (array[c][d - 1] == 0) {
	            array[c][d] = s;
	            s++;
	            d--;
	        }

	        while (array[c - 1][d] == 0) {
	            array[c][d] = s;
	            s++;
	            c--;
	        }
	    }

	    for (int x = 0; x < m; x++) {
	        for (int y = 0; y < n; y++) {
	            if (array[x][y] == 0) {
	                array[x][y] = s;
	            }
	        }
	    }

	    for (int x = 0; x < m; x++) {
	        for (int y = 0; y < n; y++) {
	           	if (array[x][y] < 10) {
	                System.out.print(array[x][y] + ",  ");
	            } else {
	                System.out.print(array[x][y] + ", ");
	            }
	        }
	        System.out.println("");
	    }
    }
}