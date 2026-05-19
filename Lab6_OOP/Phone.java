public class Phone {
    String number;
    String model;
    double weight;

    // Конструктор з трьома параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор з двома параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // Конструктор без параметрів
    public Phone() {}

    public void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    // Перевантажений метод receiveCall
    public void receiveCall(String name, String callerNumber) {
        System.out.println("Дзвонить " + name + ", номер телефону: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    // Метод з аргументами змінної довжини
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Відправка повідомлення на номери:");
        for (String num : phoneNumbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // Створення трьох екземплярів
        Phone phone1 = new Phone("099-111-11-11", "Nokia", 150.5);
        Phone phone2 = new Phone("098-222-22-22", "Samsung");
        Phone phone3 = new Phone();
        
        phone3.number = "073-333-33-33";
        phone3.model = "Apple";
        phone3.weight = 170.0;

        // Виведення значень змінних
        System.out.println("Phone 1: " + phone1.number + ", " + phone1.model + ", " + phone1.weight);
        System.out.println("Phone 2: " + phone2.number + ", " + phone2.model + ", " + phone2.weight);
        System.out.println("Phone 3: " + phone3.number + ", " + phone3.model + ", " + phone3.weight);

        // Виклик методів
        phone1.receiveCall("Олександр");
        System.out.println("Повернений номер: " + phone1.getNumber());
        
        phone2.receiveCall("Марія", "050-123-45-67");
        
        phone3.sendMessage("123-45-67", "987-65-43", "555-00-00");
    }
}