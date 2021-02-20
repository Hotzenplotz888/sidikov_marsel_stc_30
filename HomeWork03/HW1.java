import java.util.Scanner;
import java.util.Arrays;

class HW1 {

    public static void getArraySum (int array[]) {
        int arraySum = 0;
        for (int num : array) {
          arraySum = arraySum+num;
        }
        System.out.println("1.Array Sum: " + arraySum);
    }
    
    public static void reverseArray(int array[]) {

        System.out.print("2.Reverse Array: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

    public static void getArrayAverage(int array[]) {
        System.out.flush();
		double arrAvg = 0;
		int nNum = 0;
        for (int i = 0; i < array.length; i++) {
        	arrAvg += array[i];
        	nNum++;
        	}
        arrAvg /= nNum;
        System.out.println("3.Array Sum Average: " + arrAvg);
	}
	
    public static void swapArrayMinMax(int array[]) {
		int min = array[0];
		int positionOfMin = 0;
		int max = array[0];
		int positionOfMax = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				positionOfMin = i;
			}
			if (array[i] > max) {
			    max = array[i];
			    positionOfMax = i;
			}
		}
		int temp = array[positionOfMin];
		array[positionOfMin] = array[positionOfMax];
		array[positionOfMax] = temp;
		System.out.println("4.Mirror Min and Max of Array: " + Arrays.toString(array));
    }
	
	public static void concatenateArray(int array[]) {
        int number = 0;
        for (int i=0; i<array.length; i++) {
            number = number * 10 + array[i];
        }
        System.out.println("5.Concatenated Array: " + number);
    }
	
	public static void sortArrayBubble(int array[]) {  
		System.out.println("6. Array Bubble Sort: ");
		int arr[] = array;
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
	
    public static void main(String[] args) {
        
    	System.out.println("Enter number (First enter amount of numbers, you wish to process):");

    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int arraySet[] = {2, 3, 4, 5, 6};
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
        System.out.println(" ");
        
		getArraySum(arraySet);
        reverseArray(array);
        getArrayAverage(array);
        swapArrayMinMax(arraySet);
        concatenateArray(arraySet);
        sortArrayBubble(arraySet);
    }
}