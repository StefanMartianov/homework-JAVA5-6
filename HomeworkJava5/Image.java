package org.example.HomeworkJava5;

public class Image {
//    Показать на экране прямоугольник размером MxN, состоящий из
//    звёздочек. Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только рамка).

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < m; i++) {
            if (i == 0 || i == m - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
