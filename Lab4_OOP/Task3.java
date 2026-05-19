public class Task3 {
    public static void execute(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) { 
            sum += array[i];
        }
        System.out.println("Сума: " + sum); 
    }
}