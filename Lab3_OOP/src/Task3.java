public class Task3 {
    public void execute() {
        System.out.println("=== Завдання 3 (WHILE) ===");
        int hWhile = 0;
        while (hWhile <= 2) {
            int mWhile = 0;
            while (mWhile < 60) {
                System.out.println(hWhile + " h " + mWhile + " min");
                mWhile++;
            }
            hWhile++;
        }
        System.out.println("--------------------------------------------------\n");
    }
}