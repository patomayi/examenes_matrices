/**
 * Pe7.1 - DAW1B 2025/2026
 */

import java.util.Locale;
import java.util.Scanner;

public class cercardinsseqv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int f1 = sc.nextInt();
        int c1 = sc.nextInt();
        char[][] matriz1 = new char[f1][c1];
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                matriz1[i][j] = sc.next().charAt(0);
            }
        }


         sc.nextLine(); // consumir el salto de línea que queda
         String linea = sc.nextLine(); // última línea con todas las palabras
         String[] palabras = linea.split(" ");

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                char letra = matriz1[i][j];
                int contador = 0;

                for (int p = 0; p < palabras.length; p++) {
                    String palabra = palabras[p];
                    for (int k = 0; k < palabra.length(); k++) {
                        if (palabra.charAt(k) == letra) {
                            contador++;
                        }
                    }
                }

                System.out.println(letra + " " + contador);
            }
        }

         /*
         String palabra = null;
         for (int i = 0; i < f1; i++) {
         for (int j = 0; j < c1; j++) {
         palabra = sc.next();
         for (int k = 0; k < palabra.length(); k++) {
         if(matriz1[i][j] == palabra.charAt(k))
         System.out.println(palabra.charAt(k)+" " + (k));
         }
         }
         }
         */

    }
}
/*
import java.util.Locale;
import java.util.Scanner;

public class cercardinsseqv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int f1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] matriz1 = new int[f1][c1];

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        int f2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] matriz2 = new int[f2][c2];

        for (int i = 0; i < f2; i++) {
            for (int j = 0; j < c2; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Para cada número de la segunda matriz, contar en la primera (solo bucles)
        for (int i = 0; i < f2; i++) {
            for (int j = 0; j < c2; j++) {
                int buscado = matriz2[i][j];
                int cont = 0;

                for (int fila = 0; fila < f1; fila++) {
                    for (int col = 0; col < c1; col++) {
                        if (matriz1[fila][col] == buscado) {
                            cont++;
                        }
                    }
                }
                System.out.println(buscado + " " + cont);
            }
        }
    }
}
 */