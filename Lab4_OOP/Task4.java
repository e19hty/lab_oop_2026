public class Task4 {
    public static void execute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) { 
                arr[i] = -arr[i];  
            }
        }
    }
}