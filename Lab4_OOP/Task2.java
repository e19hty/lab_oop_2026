public class Task2 {
    public static void execute() {
        int[] p = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18}; 

        System.out.print("While: ");
        int i = 0;
        while (i < p.length) { 
            System.out.print(p[i] + " ");
            i++;
        }

        System.out.print("\nFor: ");
        for (int j = 0; j < p.length; j++) { 
            System.out.print(p[j] + " ");
        }

        System.out.print("\nНепарні індекси (while): ");
        int k = 1;
        while (k < p.length) { 
            System.out.print(p[k] + " ");
            k += 2;
        }

        System.out.print("\nПарні індекси (for): ");
        for (int m = 0; m < p.length; m += 2) { 
            System.out.print(p[m] + " ");
        }

        System.out.print("\nЗворотній порядок: ");
        for (int n = p.length - 1; n >= 0; n--) { 
            System.out.print(p[n] + " ");
        }
    }
}