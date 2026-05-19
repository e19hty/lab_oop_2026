 public class Lab5Variant3 {

    // 1. Метод, що обчислює та повертає площу паралелограма (Варіант 3)
    public static double getParallelogramArea(double base, double height) {
        return base * height;
    }

    // 2. Метод, що приймає три числа, виводить та повертає найменше
    public static int getMin(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Найменше число: " + min);
        return min;
    }

    // 3. Метод, що виводить масив
    public static void printArray(int[] array) {
        System.out.print("Масив: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // 4. Метод, що повертає найбільше число з масиву
    public static int getMaxFromArray(int[] array) {
        if (array.length == 0) return 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Тестування площі паралелограма
        double area = getParallelogramArea(5.0, 10.0);
        System.out.println("Площа паралелограма: " + area);

        // Тестування пошуку мінімального
        getMin(15, 8, 24);

        // Робота з масивом
        int[] myNumbers = {3, 12, 5, 28, 1};
        printArray(myNumbers);
        int maxVal = getMaxFromArray(myNumbers);
        System.out.println("Найбільше число в масиві: " + maxVal);
    }
}