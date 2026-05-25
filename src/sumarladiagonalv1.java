import java.util.Locale;
import java.util.Scanner;

public class sumarladiagonalv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        // Leer la matriz
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    res = res + sc.nextInt();
                } else {
                    sc.nextInt();
                }
            }
        }
        System.out.println(res);
    }
}
