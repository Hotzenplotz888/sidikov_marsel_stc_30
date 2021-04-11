package ru.sofronov01;

public class NumbersUtil {
    // сколько чисел максимально можно обработать
    private static final int MAX_PROCESSED_NUMBERS_COUNT = 10;
    // массив для хранения обработанных чисел
    private int[] processedNumbers;
    // сколько чисел обработали всего
    private int processedNumberCount;

    public NumbersUtil() {
        this.processedNumbers = new int[MAX_PROCESSED_NUMBERS_COUNT];
    }


    public void process(int number, ProcessFunction function) {
        if (processedNumberCount < MAX_PROCESSED_NUMBERS_COUNT) {
            // обработать
            int processedNumber = function.process(number);
            // сохранить
            saveNumber(processedNumber);
        } else {
            System.err.println("Кончилось место для обработки чисел");
        }
    }

    private void saveNumber(int number) {
        processedNumbers[processedNumberCount] = number;
        processedNumberCount++;
    }

    public void showProcessed() {
        for (int i = 0; i < processedNumberCount; i++) {
            System.out.print(processedNumbers[i] +  " ");
        }
    }
}
