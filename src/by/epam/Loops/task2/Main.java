package by.epam.Loops.task2;

import java.util.Scanner;

/*Вычислить значения функции на отрезке [а,b] c шагом h*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the values of a, b and h");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int x;
        int result = 0;
        
        for (; a < b; a += h) {
            x = a;
            if (x > 2) {
                result = x;
            } else if (x <= 2) {
                result = -x;
            }
            System.out.print(result );
        }
    }
}
