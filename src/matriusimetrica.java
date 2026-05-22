/**
 * Pe7.1 - DAW1B 2025/2026
 */

import java.util.Locale;
import java.util.Scanner;

public class matriusimetrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int [][] matriz = new int[n][n];

        // Leer la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean simetrica = true;

        // Comprobar solo la mitad superior
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) break;
        }

        System.out.println(simetrica ? "SI" : "NO");
    }
}
