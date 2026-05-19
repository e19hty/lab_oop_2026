package main;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task4_1 {
    public void execute(Scanner s) {
        System.out.println("\n--- Завдання 4.1: Обчислення f(x) ---");
        System.out.print("Введіть значення x: ");
        double x = s.nextDouble();
        double f = 0;

        if (x < 0) {
            f = pow(pow(x, 2) + 3, 1.0 / 5.0);
        } else if (x >= 0 && x <= 3) {
            f = cosh(x) + 5;
        } else {
            f = -x + log10(x); 
        }

        System.out.printf("Результат: f(x) = %.4f\n", f);
    }
}