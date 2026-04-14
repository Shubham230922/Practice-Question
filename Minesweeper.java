import java.util.Scanner;

public class Minesweeper {
    static int[][] direction = {
            { -1, -1 }, { -1, 0 }, { -1, 1 },
            { 0, -1 }, { 0, 1 },
            { 1, -1 }, { 1, 0 }, { 1, 1 }

    };

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] b = new char[m][n];
        System.err.println("mine * and empty .");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.next().charAt(0);
            }
        }
        char[][] result = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == '*') {
                    result[i][j] = '*';

                } else {
                    int c = 0;
                    for (int[] d : direction) {
                        int ni = i + d[0];
                        int nj = j + d[1];
                        if (ni >= 0 && nj >= 0 && ni < m && nj < m && b[ni][nj] == '*') {
                            c++;
                        }

                    }
                    result[i][j] = (char) (c + '0');
                }

            }
        }
        System.out.println("Output");
        for (char[] row : result) {
            for (char c1 : row) {
                System.out.print(c1 + " ");

            }
            System.out.println();
        }
    }

    /*
     * Sample output
     * 3
     * 3
     * mine * and empty .
     * . .
     * . . .
     * . * .
     * Output
     * 1 0
     * 2 2 1
     * 1 * 1
     */
}
