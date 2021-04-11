package ru.sofronov02;

public class Main {
    public static void main(String[] args) {
        NumbersAndStringProcessor numbersAndStringProcessor = new NumbersAndStringProcessor();

        NumbersProcess reverseFunction = number -> {
        int processedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            processedNumber = processedNumber * 10 + digit;
            number /= 10;
        }
        return processedNumber;
    };

        NumbersProcess deNullFunction = number -> {
            int processedNumber = number;
            String s= String.valueOf(processedNumber);
            s = s.replaceAll("0","");
            s = StringFormatter.reverseString(s);
            int processedNumber1 = Integer.parseInt(s);
            return processedNumber1;
            };

    NumbersProcess eveningFunction = number -> {
        int processedNumber = number;
        if (number % 2 == 0) {
            return processedNumber;
        } else {
            return processedNumber - 1;
        }
    };

    //StringProcess reverseString = string ->  {
    //};


        numbersAndStringProcessor.process1(1234,reverseFunction);
        numbersAndStringProcessor.process1(7778,reverseFunction);
        numbersAndStringProcessor.process1(1112,reverseFunction);
        numbersAndStringProcessor.process1(1151,reverseFunction);
        numbersAndStringProcessor.process1(1234,eveningFunction);
        numbersAndStringProcessor.process1(777,eveningFunction);
        numbersAndStringProcessor.process1(110,eveningFunction);
        numbersAndStringProcessor.process1(115,eveningFunction);
        numbersAndStringProcessor.process1(1234,deNullFunction);
        numbersAndStringProcessor.process1(777,deNullFunction);
        numbersAndStringProcessor.process1(111,deNullFunction);
        numbersAndStringProcessor.process1(115,deNullFunction);

        //numbersAndStringProcessor.process2("",reverseString);

        numbersAndStringProcessor.showProcessed();

        System.out.println();
}

}
