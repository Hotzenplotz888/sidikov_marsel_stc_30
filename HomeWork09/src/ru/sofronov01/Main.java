package ru.sofronov01;

public class Main {
    public static void main(String[] args) {
        NumbersUtil numbersUtil = new NumbersUtil();

        ProcessFunction reverseFunction = number -> {
            int processedNumber = 0;
            while (number != 0) {
                int digit = number % 10;
                processedNumber = processedNumber * 10 + digit;
                number /= 10;
            }
            return processedNumber;
        };

//        NumbersProcess deNullFunction = number -> {
//            int processedNumber = number;
//            String string_number = Integer.toString(processedNumber);
//            for (int i = 0; i < string_number.length(); i++) {
//
//                return string_number.charAt(i);
//            }
//        };

        ProcessFunction eveningFunction = number -> {
            if (number % 2 == 0) {
                return number;
            } else {
                return number - 1;
            }
        };

        numbersUtil.process(1234, reverseFunction);
        numbersUtil.process(778, reverseFunction);
        numbersUtil.process(111, reverseFunction);
        numbersUtil.process(115, reverseFunction);
        numbersUtil.process(1234, eveningFunction);
        numbersUtil.process(777, eveningFunction);
        numbersUtil.process(110, eveningFunction);
        numbersUtil.process(115, eveningFunction);

        numbersUtil.showProcessed();

        System.out.println();
    }

}
