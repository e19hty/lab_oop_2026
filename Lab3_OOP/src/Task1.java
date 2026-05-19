public class Task1 {
    public void execute() {
        System.out.println("=== Завдання 1 ===");
        String phrase = "Програмування - це круто!";

        System.out.println("Цикл FOR:");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". " + phrase);
        }

        System.out.println("\nЦикл WHILE:");
        int j = 0;
        while (j < 50) {
            System.out.println((j + 1) + ". " + phrase);
            j++;
        }
        System.out.println("--------------------------------------------------\n");
    }
}