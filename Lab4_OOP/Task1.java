public class Task1 {
    public static void execute() {
        int[] numbers = new int[50]; 

        for (int i = 0; i < numbers.length; i++) { 
            numbers[i] = i * 2;
            
        }
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 1;
        }
    }
}