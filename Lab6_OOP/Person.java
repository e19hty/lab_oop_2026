public class Person {
    String fullName;
    int age;

    // Конструктор без параметрів
    public Person() {
        this.fullName = "Невідомий";
        this.age = 0;
    }

    // Конструктор з параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорить");
    }

    public void talk() {
        System.out.println(fullName + " говорить");
    }

    public static void main(String[] args) {
        // Створення двох об'єктів
        Person person1 = new Person();
        Person person2 = new Person("Іван Іванов", 25);

        // Виклик методів
        person1.move();
        person2.talk();
    }
}