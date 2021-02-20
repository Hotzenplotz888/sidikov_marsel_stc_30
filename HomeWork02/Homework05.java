import java.util.Scanner;
import java.util.Arrays;

class Homework05 {
 
  	public static void main(String[] args) {  
		System.out.println("Enter number (first enter the amount of numbers you wish to display):");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int numbers[] = new int[n];
		
		for (int y = 0; y < numbers.length; y++) {
				numbers[y] = scanner.nextInt();
		}
			
		System.out.println(Arrays.toString(numbers));
		int arr[] = numbers;
		System.out.println("---Array BEFORE Bubble Sort---"); 
	    printArray(arr);
	    bubbleSort(arr);
	    System.out.println("---Array AFTER Bubble Sort---");  
	    printArray(arr); 
  	}  

   	static void bubbleSort(int[] array) {  
	    int k = array.length;  
	    int temp = 0;  
	    for (int i=0; i < k; i++) {
	    	System.out.println("Sort Pass Number "+(i+1)); 
	      	for (int j=1; j < (k-i); j++) {  
	          	System.out.println("Comparing "+ array[j-1]+ " and " + array[j]);    
	        		if (array[j-1] > array[j]) {   
		            temp = array[j-1];  
		          	array[j-1] = array[j];  
		          	array[j] = temp;  
		            System.out.println(array[j]  + " is greater than " + array[j-1]);
		            System.out.println("Swapping Elements: New Array After Swap");
		          	printArray(array);
	        	}  
	      	}  
	    }  
  	} 
  
  	static void printArray(int[] array){
      	for(int i=0; i < array.length; i++) {  
      	System.out.print(array[i] + " ");  
    } 
      	System.out.println();
  	}
}