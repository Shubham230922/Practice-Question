import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pairs of strings (Ctrl+D to stop):");

        while (sc.hasNext()) {

            String s1 = sc.next();
            String s2 = sc.next();

            int[] f1 = new int[26];
            int[] f2 = new int[26];

            // Count frequency
            for (char c : s1.toCharArray()) {
                f1[c - 'a']++;
            }

            for (char c : s2.toCharArray()) {
                f2[c - 'a']++;
            }

            System.out.print("Output: ");

            // Print common characters
            for (int i = 0; i < 26; i++) {
                int min = Math.min(f1[i], f2[i]);

                for (int j = 0; j < min; j++) {
                    System.out.print((char)(i + 'a'));
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
/*Enter pairs of strings (Ctrl+D to stop):
pretty women
Output: e

walking down
Output: nw*/