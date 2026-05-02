import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {  

            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean[] seen = new boolean[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 1; i < n; i++) {
                int d = Math.abs(arr[i] - arr[i - 1]);

                if (d > 0 && d < n) {
                    seen[d] = true;
                }
            }

            boolean jolly = true;

            for (int i = 1; i < n; i++) {
                if (!seen[i]) {
                    jolly = false;
                    break;
                }
            }

            System.out.println(jolly ? "Jolly" : "Not Jolly");
        }

        sc.close();
    }
}