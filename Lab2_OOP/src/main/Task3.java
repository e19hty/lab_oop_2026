package main;
import java.util.Scanner;

public class Task3 {
    public void execute(Scanner s) {
        System.out.println("\n--- Завдання 3: Перевірка числа ---");
        System.out.print("Введіть ціле число: ");
        int num = s.nextInt();

        if (Math.abs(num) >= 10 && Math.abs(num) <= 99 && num % 2 == 0) {
            System.out.println("Число є двозначним і парним.");
        } else {
            System.out.println("Число не відповідає обом умовам.");
        }
    }
}