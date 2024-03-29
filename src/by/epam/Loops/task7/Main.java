package by.epam.Loops.task7;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Main {
	
    public static void main(String[] args) {
        System.out.println("Enter the boundaries of the interval (m,n)");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (; m < n; m++) {
            System.out.print("Dividers for number " + m + ":");
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    System.out.print(i + "\t");
                }
            }
            System.out.println();
        }
    }
}
