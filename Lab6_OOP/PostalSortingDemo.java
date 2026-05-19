import java.util.Scanner;

// Базовий клас згідно варіанту 5.1
class PostalSorting {
    protected String city;
    protected String street;
    protected String house;
    protected String apartment;
    protected int parcelCount;
    protected double costPerParcel;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть місто: ");
        this.city = scanner.nextLine();
        System.out.print("Введіть вулицю: ");
        this.street = scanner.nextLine();
        System.out.print("Введіть будинок: ");
        this.house = scanner.nextLine();
        System.out.print("Введіть квартиру: ");
        this.apartment = scanner.nextLine();
        System.out.print("Введіть кількість посилок: ");
        this.parcelCount = scanner.nextInt();
        System.out.print("Введіть вартість однієї посилки: ");
        this.costPerParcel = scanner.nextDouble();
    }

    public void outputData() {
        System.out.println("\n--- Дані поштового сортування ---");
        System.out.println("Адреса: м. " + city + ", вул. " + street + ", буд. " + house + ", кв. " + apartment);
        System.out.println("Кількість посилок: " + parcelCount);
        System.out.println("Вартість однієї посилки: " + costPerParcel + " грн");
        System.out.println("Сумарна вартість: " + calculateTotalCost() + " грн");
    }

    public double calculateTotalCost() {
        return parcelCount * costPerParcel;
    }
}

// Клас-спадкоємець (Завдання 6)
class ExpressPostalSorting extends PostalSorting {
    // Додані два нові поля
    private boolean isExpressDelivery; 
    private String courierName;        

    public void setExpressData(boolean isExpressDelivery, String courierName) {
        this.isExpressDelivery = isExpressDelivery;
        this.courierName = courierName;
    }

    // Перевизначена функція виведення
    @Override
    public void outputData() {
        super.outputData(); 
        System.out.println("Тип доставки: " + (isExpressDelivery ? "Експрес" : "Стандартна"));
        System.out.println("Ім'я кур'єра: " + courierName);
        System.out.println("---------------------------------");
    }
}

// Головний клас для запуску програми
public class PostalSortingDemo {
    public static void main(String[] args) {
        ExpressPostalSorting expressSorting = new ExpressPostalSorting();
        
        System.out.println("Введіть дані для поштового відправлення:");
        expressSorting.inputData();
        
        // Ініціалізуємо нові поля спадкоємця
        expressSorting.setExpressData(true, "Петренко Василь");
        
        // Виводимо всі дані на екран
        expressSorting.outputData();
    }
}