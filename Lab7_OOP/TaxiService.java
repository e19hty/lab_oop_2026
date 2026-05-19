
import java.util.ArrayList;
import java.util.Random;

// Клас водія [cite: 215]
class Driver {
    String name;
    int age;
    int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водій: " + name + ", Вік: " + age + ", Стаж: " + experience;
    }
}

// Клас автомобіля [cite: 214]
class Car {
    String brand;
    double power;
    Driver driver;
    double price;
    int year;

    public Car(String brand, double power, Driver driver, double price, int year) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", Потужність: " + String.format("%.1f", power) + 
               ", Ціна: " + String.format("%.0f", price) + ", " + driver;
    }
}

// Клас хелпер [cite: 223]
class Helper {
    public static void processOrder(ArrayList<Car> cars) {
        Random random = new Random();
        int index = random.nextInt(cars.size());
        Car selectedCar = cars.get(index);
        
        System.out.println("Автомобіль марки " + selectedCar.brand + " з водієм " + selectedCar.driver.name + " виїхав за вами"); // 
        arriveAtLocation(selectedCar);
    }

    public static void arriveAtLocation(Car car) {
        System.out.println("Водій " + car.driver.name + " прибув на місце"); // [cite: 225]
    }
}

public class TaxiService {
    public static void main(String[] args) {
        ArrayList<Car> taxiFleet = new ArrayList<>(); // [cite: 218]

        // Створення 10 автомобілів [cite: 217]
        for (int i = 1; i <= 10; i++) {
            Driver d = new Driver("Водій_" + i, 20 + i, i + 2);
            taxiFleet.add(new Car("Toyota_" + i, 150.0, d, 20000.0, 2015 + (i % 5)));
        }

        // 1. Ремонт мотору (+10% потужності) для першої половини та нові водії [cite: 219, 220]
        for (int i = 0; i < taxiFleet.size() / 2; i++) {
            Car car = taxiFleet.get(i);
            car.power *= 1.1; 
            car.driver = new Driver("Новий_Водій_" + i, 30, 10);
        }

        // 2. Кожна друга машина: +10% потужності та +5% ціни [cite: 221]
        for (int i = 0; i < taxiFleet.size(); i += 2) {
            Car car = taxiFleet.get(i);
            car.power *= 1.1;
            car.price *= 1.05;
        }

        // 3. Перевірка досвіду всіх водіїв [cite: 222]
        for (Car car : taxiFleet) {
            if (car.driver.experience < 5 && car.driver.age > 25) {
                car.driver.experience += 1;
                System.out.println("Водій " + car.driver.name + " пройшов курси підвищення кваліфікації.");
            }
        }

        // Виклик хелпера
        Helper.processOrder(taxiFleet);
    }
}