// Базовий клас
class Shape {
    protected double volume;
    public double getVolume() { return volume; }
}

// Проміжні та похідні класи
class SolidOfRevolution extends Shape {
    protected double radius;
    public double getRadius() { return radius; }
}

class Cylinder extends SolidOfRevolution {
    private double height;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.volume = Math.PI * radius * radius * height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        this.radius = radius;
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Pyramid extends Shape {
    private double s;
    private double h;
    
    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = (1.0 / 3.0) * s * h;
    }
}

// Головний клас для запуску (Точка входу)
public class MainShape {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 10);
        Ball ball = new Ball(5);
        Pyramid pyramid = new Pyramid(10, 15);

        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
        System.out.println("Об'єм кулі: " + ball.getVolume());
        System.out.println("Об'єм піраміди: " + pyramid.getVolume());
    }
}