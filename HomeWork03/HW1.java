import java.util.Scanner;
import java.util.Arrays;

class HW1 {

    public static void getArraySum (int array[]) {
        int arraySum = 0;
        for (int num : array) {
          arraySum += num;
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
		array[positionOfMin] = max;
		array[positionOfMax] = min;
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
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	    System.out.println("---Array AFTER Bubble Sort---");  
	    printArray(arr); 
  	}  

 	static void printArray(int[] array){
      	for(int i=0; i < array.length; i++) {  
      	System.out.print(array[i] + " ");  
    } 
      	System.out.println();
  	}  
	
    public static void main(String[] args) {
        
    	System.out.println("Enter number (First enter # of numbers, you need):");

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