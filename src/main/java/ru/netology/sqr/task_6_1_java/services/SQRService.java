package ru.netology.sqr.task_6_1_java.services;
public class SQRService {
    public int calcSqr(int bottom_border, int top_border) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (bottom_border <= Math.pow(i, 2) && top_border >= Math.pow(i, 2)) {
                counter++;
            }
       }
        return counter;
    }
}
