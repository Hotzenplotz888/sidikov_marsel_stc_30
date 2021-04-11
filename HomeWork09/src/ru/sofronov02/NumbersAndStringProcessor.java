package ru.sofronov02;

public class NumbersAndStringProcessor {
    // сколько элементов максимум можно обработать
    private static final int MAX_PROCESSED_ELEMENTS_COUNT = 10;
    // массив для хранения обработанных чисел
    private int[] processedNumbers;
    // сколько элементов обработали всего
    private int processedNumbersCount;
    private String[] processedStrings;
    private int processedStringsCount;
    private int processedElementCount;

    public NumbersAndStringProcessor() {
        this.processedNumbers = new int[MAX_PROCESSED_ELEMENTS_COUNT];
    }

    public void process1(int number, NumbersProcess function) {
        if (processedElementCount < MAX_PROCESSED_ELEMENTS_COUNT) {
            // обработать
            int processedNumber = function.process1(number);
            // сохранить
            saveNumber(processedNumber);
        } else {
            System.err.println("Кончилось место для обработки элементов");
        }
    }

    public void process2(String string, StringProcess function) {
        if (processedElementCount < MAX_PROCESSED_ELEMENTS_COUNT) {
            // обработать
            String processedStrings = function.process2(string);
            // сохранить
            saveString(processedStrings);
        } else {
            System.err.println("Кончилось место для обработки элементов");
        }
    }



    private void saveNumber(int number) {
        processedNumbers[processedNumbersCount] = number;
        processedElementCount++;
    }

    private void saveString(String string) {
        processedStrings[processedStringsCount] = string;
        processedElementCount++;
    }

    public void showProcessed() {
        for (int i = 0; i < processedElementCount; i++) {
            System.out.print(processedNumbers[i] +  " ");
        }
    }
}
