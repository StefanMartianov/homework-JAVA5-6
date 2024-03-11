package org.example.HomeworkJAVA4;

public class Comparate {
    //     1 уровень сложности: 1. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа. Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = 99;

        int max = Math.max(a, Math.max(b,c));
        int min = Math.min(a, Math.min(b,c));

        int mid = a + b + c - min - max;
        System.out.println(min + " " + mid + " " + max);

    }


}
