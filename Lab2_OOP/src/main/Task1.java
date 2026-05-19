package main;
import java.util.Scanner;
// Статичний імпорт дозволяє не писати Math. перед кожною функцією
import static java.lang.Math.*; 

public class Task1 {
    public void execute(Scanner s) {
        System.out.println("\n--- Завдання 1: Квадратне рівняння ---");
        System.out.print("Введіть коефіцієнти a, b, c: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double d = pow(b, 2) - 4 * a * c; // Код став значно чистішим
        if (d > 0) {
            double x1 = (-b + sqrt(d)) / (2 * a);
            double x2 = (-b - sqrt(d)) / (2 * a);
            System.out.printf("Корені: x1 = %.2f, x2 = %.2f\n", x1, x2);
        } else if (d == 0) {
            System.out.printf("Один корінь: x = %.2f\n", -b / (2 * a));
        } else {
            System.out.println("Рівняння не має дійсних коренів.");
        }
    }
}
