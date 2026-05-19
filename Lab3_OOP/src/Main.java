import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Створюємо об'єкти класів та викликаємо їх методи
        Task1 task1 = new Task1();
        task1.execute();

        Task2 task2 = new Task2();
        task2.execute();

        Task3 task3 = new Task3();
        task3.execute();

         //Task4 task4 = new Task4();
        //task4.execute();

        Task5 task5 = new Task5();
        task5.execute(scanner);

        scanner.close();
        System.out.println("Виконання програми завершено.");
    }
}