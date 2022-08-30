package ru.netology.sqr;

public class SQRService {

    public int sqrCalcQuantity (int lowerBound, int upperBound) {
        int result = 0;
        for (int i = 10; i <= 99; i = i + 1) {
            int sqr = i * i;
            if (sqr >= lowerBound && sqr <= upperBound) {
                result = result + 1;
            }
        }
        return result;
    }
}