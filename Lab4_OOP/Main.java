public class Main {
    public static void main(String[] args) {
        System.out.println("--- Виконання Лабораторної роботи №4 ---");

        // Виклик Завдання 1
        Task1.execute();
        System.out.println("Завдання 1 виконано.");

        // Виклик Завдання 2
        System.out.println("\nЗавдання 2:");
        Task2.execute();

        // Виклик Завдання 3
        System.out.println("\n\nЗавдання 3:");
        double[] testArray = {1.1, 2.2, 3.3, 4.4};
        Task3.execute(testArray);

        // Виклик Завдання 4
        System.out.println("\nЗавдання 4:");
        int[] intArr = {1, 2, 3, 4, 5};
        Task4.execute(intArr);
        System.out.println("Знаки непарних елементів змінено.");
    }
}