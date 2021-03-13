//Задание 2.
//Реализовать метод бинарного поиска с помощью рекурсии.
class HW2 {

	int binSearchRec(int myArr[], int left, int right, int key){
		if (right >= left){
			int mid = left + (right - left) / 2;
			if (myArr[mid] == key)
				return mid;
			if (myArr[mid] > key)
				return binSearchRec(myArr, left, mid - 1, key);
			return binSearchRec(myArr, mid + 1, right, key);
		}
		return -1;
	}
	public static void main(String args[]){
		HW2 myObject = new HW2();
		int myArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		//int myArr[] = { 6, 2, 3, 7, 5, 6, 4, 8, 9, 1};
		int length = myArr.length;
		int key = 4;
		int result = myObject.binSearchRec(myArr, 0, length - 1, key);
		if (result == -1)
			System.out.println("No key");
		else
			System.out.println("Key is at index: " + result);
	}

}