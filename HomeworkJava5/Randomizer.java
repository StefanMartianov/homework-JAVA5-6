package org.example.HomeworkJava5;

import java.util.Random;

public class Randomizer {
//     1 уровень сложности: 1. Загадать случайно 100 целых чисел в диапазоне от -100 до 100.
//    Вычислить процент положительных чисел, процент отрицательных чисел и процент нулей. Вычислить процент чётных чисел и процент нечётных.

    public static void main(String[] args) {

        int[] massive = new int[100];

        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(201) - 100;
        }
        int counterPositive = 0;
        int counterNegative = 0;
        int counterNull = 0;
        int counterOdd = 0;
        int counterEven = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 0) {
                counterPositive += 1;
            } else if (massive[i] < 0) {
                counterNegative += 1;
            } else {
                counterNull += 1;
            }
            if (massive[i] % 2 == 0) {
                counterEven += 1;
            } else {
                counterOdd += 1;
            }
        }

        double positiveProzent = counterPositive * 1.0 / massive.length * 100.0;
        double negativeProzent = counterNegative * 1.0 / massive.length * 100.0;
        double nullProzent = counterNull * 1.0 / massive.length * 100.0;
        double oddProzent = counterOdd * 1.0 / massive.length * 100.0;
        double evenProzent = counterEven * 1.0 / massive.length * 100.0;

        System.out.println("положиетльных чисел " + positiveProzent + "%");
        System.out.println("отрицательных чисел " + negativeProzent + "%");
        System.out.println("нулей " + nullProzent + "%");
        System.out.println("четных чисел " + evenProzent + "%");
        System.out.println("нечетных чисел " + oddProzent + "%");
    }
}
