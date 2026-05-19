import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<>(); // [cite: 140]

        // Додавання 10 записів (put) [cite: 229, 235]
        book.put("Іванов", "0671112233");
        book.put("Петров", "0504445566");
        book.put("Сидоров", "0937778899");
        book.put("Коваленко", "0660001122");
        book.put("Бондар", "0973334455");
        book.put("Ткаченко", "0636667788");
        book.put("Шевченко", "0509990011");
        book.put("Лисенко", "0682223344");
        book.put("Мельник", "0955556677");
        book.put("Павленко", "0738889900");

        // Виведення інформації через цикл [cite: 236]
        System.out.println("Повний список абонентів:");
        for (String surname : book.keySet()) {
            System.out.println("Прізвище: " + surname + ", Тел: " + book.get(surname)); // [cite: 188]
        }

        // Пошук за прізвищем (get) [cite: 230, 237]
        String searchName = "Петров";
        if (book.containsKey(searchName)) { // [cite: 232]
            System.out.println("\nЗнайдено номер для " + searchName + ": " + book.get(searchName));
        } else {
            System.out.println("\nУ книзі відсутній такий абонент"); // [cite: 237]
        }

        // Перевірка наявності значення [cite: 233]
        System.out.println("Чи є в книзі номер 0671112233? " + book.containsValue("0671112233"));

        // Видалення довільного запису (remove) [cite: 231, 238]
        book.remove("Сидоров");
        System.out.println("Запис 'Сидоров' видалено.");

        // Кількість записів (size) [cite: 234, 238]
        System.out.println("Кількість записів у книзі: " + book.size());
    }
}