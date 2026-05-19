import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Перевірка наявності необхідних аргументів: ім'я файлу, b1, b2
        if (args.length < 3) {
            System.out.println("Помилка! Введіть: <ім'я_файлу> <b1> <b2>");
            return;
        }

        String fileName = args[0];
        int b1 = Integer.parseInt(args[1]);
        int b2 = Integer.parseInt(args[2]);
        
        // 1. Робота з класом File для перевірки існування [cite: 25, 26]
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Файл не знайдено. Створено новий файл: " + fileName);
                }
            } else {
                System.out.println("Файл вже існує: " + fileName);
            }

            // 2. Запис випадкових чисел за допомогою FileWriter [cite: 18, 39]
            FileWriter writer = new FileWriter(file);
            Random random = new Random();
            
            System.out.print("Генерування чисел: ");
            for (int i = 0; i < 10; i++) {
                // Формула для генерування: new Random().nextInt(b2-b1+1)+b1 [cite: 42]
                int randomNumber = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(randomNumber + " "); 
                System.out.print(randomNumber + " ");
            }
            writer.close(); // Закриття потоку обов'язкове [cite: 24]
            System.out.println("\nЗапис у файл завершено.");

            // 3. Читання з файлу за допомогою FileReader [cite: 18, 43]
            System.out.println("Читання з файлу:");
            FileReader reader = new FileReader(file);
            int character;
            // Посимвольне читання до кінця файлу (-1) [cite: 15, 19]
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close(); // Закриття потоку [cite: 24]
            System.out.println("\n\nРоботу програми завершено!"); // [cite: 16]

        } catch (IOException e) {
            System.out.println("Сталася помилка при роботі з файлом: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Помилка! Параметри b1 та b2 мають бути цілими числами.");
        }
    }
}