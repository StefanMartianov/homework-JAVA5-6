package org.example.HomeworkJAVA4;

public class Quadratik {
    public static void main(String[] args) {
        //    В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
      double a =  1;
      double b = -2;
      double c = -3;
      double disc = b*b-4*a*c;

      if (disc == 0) {
          double x =  (-b) / 2*a;
          System.out.println("1 корень: " + x);
      }else if (disc > 0){
          double x1 = (-b - Math.sqrt(disc))/2*a;
          double x2 = (-b + Math.sqrt(disc))/2*a;
          System.out.println("2 корня:  " + x1 + " и " + x2);
      } else {
          System.out.println("нет корней");
      }

    }
}
