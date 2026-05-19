import java.time.Duration;

public class Task4 {
    public void execute() {
        System.out.println("=== Завдання 4 (Оптимізовано з Duration) ===");
        int totalSeconds = 3 * 60 * 60; // 3 години у секундах
        
        for (int s = 0; s < totalSeconds; s++) {
            Duration duration = Duration.ofSeconds(s);
            System.out.printf("%d h %d min %d sec\n",
                    duration.toHours(),
                    duration.toMinutesPart(),
                    duration.toSecondsPart());
        }
        System.out.println("--------------------------------------------------\n");
    }
}