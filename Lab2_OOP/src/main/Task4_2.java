package main;
import java.util.Scanner;

public class Task4_2 {
    public void execute(Scanner s) {
        int variant;
        do {
            System.out.println("\n=================================");
            System.out.println("Завдання 4.2. Оберіть варіант (1-7)");
            System.out.println("Введіть 0 для переходу далі / виходу");
            System.out.print("Ваш вибір: ");
            variant = s.nextInt();

            switch (variant) {
                case 1:
                    System.out.print("Введіть номер дня тижня (1-7): ");
                    int day = s.nextInt();
                    switch (day) {
                        case 1: case 2: case 3: case 4: case 5: System.out.println("Це робочий день."); break;
                        case 6: case 7: System.out.println("Це вихідний день."); break;
                        default: System.out.println("Невірний номер дня.");
                    }
                    break;
                case 2:
                    System.out.print("Введіть номер місяця (1-12): ");
                    int month2 = s.nextInt();
                    switch (month2) {
                        case 12: case 1: case 2: System.out.println("Зима"); break;
                        case 3: case 4: case 5: System.out.println("Весна"); break;
                        case 6: case 7: case 8: System.out.println("Літо"); break;
                        case 9: case 10: case 11: System.out.println("Осінь"); break;
                        default: System.out.println("Невірний номер місяця.");
                    }
                    break;
                case 3:
                    System.out.print("Введіть номер місяця (1-12): ");
                    int month3 = s.nextInt();
                    switch (month3) {
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("31 день."); break;
                        case 4: case 6: case 9: case 11: System.out.println("30 днів."); break;
                        case 2: System.out.println("28 або 29 днів."); break;
                        default: System.out.println("Невірний номер.");
                    }
                    break;
                case 4:
                    System.out.println("1 - Привітання\n2 - Запрошення до роботи\n3 - Завершити роботу");
                    System.out.print("Ваш вибір: ");
                    int choice4 = s.nextInt();
                    switch (choice4) {
                        case 1: System.out.println("Привіт!"); break;
                        case 2: System.out.println("Запрошуємо до роботи на комп'ютері!"); break;
                        case 3: System.out.println("Роботу завершено."); break;
                        default: System.out.println("Невірний пункт.");
                    }
                    break;
                case 5:
                    System.out.print("Введіть номер пари (1-4): ");
                    int pair = s.nextInt();
                    switch (pair) {
                        case 1: System.out.println("Об'єктно-орієнтоване програмування (Java)"); break;
                        case 2: System.out.println("Кіберфізичні системи"); break;
                        case 3: System.out.println("Програмування мовою C++"); break;
                        case 4: System.out.println("Основи Python"); break;
                        default: System.out.println("Такої пари немає.");
                    }
                    break;
                case 6:
                    System.out.print("Введіть хвилини (від 0 до 59): ");
                    int min = s.nextInt();
                    if (min >= 0 && min <= 59) {
                        switch (min / 15) {
                            case 0: System.out.println("Перша чверть години."); break;
                            case 1: System.out.println("Друга чверть години."); break;
                            case 2: System.out.println("Третя чверть години."); break;
                            case 3: System.out.println("Четверта чверть години."); break;
                        }
                    } else {
                        System.out.println("Помилка вводу.");
                    }
                    break;
                case 7:
                    System.out.print("Введіть перше число: ");
                    double a = s.nextDouble();
                    System.out.print("Введіть друге число: ");
                    double b = s.nextDouble();
                    System.out.println("1 - Добуток\n2 - Сума\n3 - Різниця");
                    System.out.print("Оберіть дію: ");
                    int choice7 = s.nextInt();
                    switch (choice7) {
                        case 1: System.out.println("Добуток: " + (a * b)); break;
                        case 2: System.out.println("Сума: " + (a + b)); break;
                        case 3: System.out.println("Різниця: " + (a - b)); break;
                        default: System.out.println("Невірний пункт.");
                    }
                    break;
                case 0:
                    System.out.println("Вихід із завдання 4.2.");
                    break;
                default:
                    System.out.println("Невірний варіант! Спробуйте ще раз.");
            }
        } while (variant != 0);
    }
}