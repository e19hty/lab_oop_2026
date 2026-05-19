package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Лабораторна робота 2. Використання умовних операторів");

        Task1 t1 = new Task1();
        t1.execute(scanner);

        Task2 t2 = new Task2();
        t2.execute(scanner);

        Task3 t3 = new Task3();
        t3.execute(scanner);

        Task4_1 t4_1 = new Task4_1();
        t4_1.execute(scanner);

        Task4_2 t4_2 = new Task4_2();
        t4_2.execute(scanner);

        scanner.close();
        System.out.println("\nРоботу програми завершено.");
    }
}