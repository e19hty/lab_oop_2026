abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println("Газуємо!");
    }

    // Абстрактний метод для гальмування
    public abstract void brake();
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Седан (" + model + ") плавно гальмує.");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Вантажівка (" + model + ") використовує пневматичні гальма.");
    }
}

// Головний клас для запуску програми
public class CarDemo {
    public static void main(String[] args) {
        // Створення об'єктів
        Car mySedan = new Sedan("Toyota Camry", "Чорний", 220);
        Car myTruck = new Truck("Volvo FH", "Білий", 120);

        // Виконання методів
        mySedan.gas();
        mySedan.brake();

        myTruck.gas();
        myTruck.brake();
    }
}