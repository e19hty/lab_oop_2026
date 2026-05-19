import java.util.Scanner;
import java.text.DecimalFormat;

public class Task5 {
    public void execute(Scanner scanner) {
        System.out.println("=== Завдання 5 (Варіант 10) ===");
        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.print("Введіть нижню границю діапазону для значень функції: ");
        double minY = scanner.nextDouble();
        System.out.print("Введіть верхню границю діапазону для значень функції: ");
        double maxY = scanner.nextDouble();

        System.out.println("\n--- Табулювання (FOR) ---");
        int countFor = 0;
        
        for (double x = 0; x <= 4.001; x += 0.2) {
            double y = (Math.cbrt(x) + x + 1.5) / (x + 1); // Використано кубічний корінь
            System.out.println("x = " + df.format(x) + ",\t f(x) = " + df.format(y));
            
            if (y >= minY && y <= Math.nextUp(maxY)) {
                countFor++;
            }
        }
        System.out.println("Кількість значень у заданому діапазоні (FOR): " + (countFor > 0 ? countFor : "відсутні"));

        System.out.println("\n--- Табулювання (WHILE) ---");
        int countWhile = 0;
        double xWhile = 0;
        
        while (xWhile <= 4.001) {
            double y = (Math.cbrt(xWhile) + xWhile + 1.5) / (xWhile + 1);
            System.out.println("x = " + df.format(xWhile) + ",\t f(x) = " + df.format(y));
            
            if (y >= minY && y <= Math.nextUp(maxY)) {
                countWhile++;
            }
            xWhile += 0.2;
        }
        System.out.println("Кількість значень у заданому діапазоні (WHILE): " + (countWhile > 0 ? countWhile : "відсутні"));
        System.out.println("--------------------------------------------------\n");
    }
}