class Homework06 {
    public static void main(String[] args) {
        int array[] = {4, 2, 3, 5, 7};
        int number = 0;
        //String result = "" + array[0] + array[1] + array[2] + array[3] + array[4];
        //System.out.println(result);

        for (int i=0; i<array.length; i++) {
            number = number * 10 + array[i];
        }

        System.out.println(number); // программа должна вывести 42357
    }
}