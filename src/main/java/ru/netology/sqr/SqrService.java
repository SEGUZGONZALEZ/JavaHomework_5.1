package ru.netology.sqr;

public class SqrService {

    public int calculate(int underRange, int upperRange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (underRange <= sqr && sqr <= upperRange) {
                counter++;
            }
        }
        return counter;
    }
}
