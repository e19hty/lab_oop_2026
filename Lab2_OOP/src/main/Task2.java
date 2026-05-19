package main;
import java.util.Scanner;

public class Task2 {
    public void execute(Scanner s) {
        System.out.println("\n--- Завдання 2: Квадрант координатної площини ---");
        System.out.print("Введіть координати x та y: ");
        double x = s.nextDouble();
        double y = s.nextDouble();

        if (x > 0 && y > 0) System.out.println("Точка у I чверті");
        else if (x < 0 && y > 0) System.out.println("Точка у II чверті");
        else if (x < 0 && y < 0) System.out.println("Точка у III чверті");
        else if (x > 0 && y < 0) System.out.println("Точка у IV чверті");
        else System.out.println("Точка лежить на осі координат");
    }
}