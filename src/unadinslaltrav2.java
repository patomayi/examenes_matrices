import java.util.Locale;
import java.util.Scanner;

public class unadinslaltrav2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int f = sc.nextInt();
        int c = sc.nextInt();

        // 1. LLENAR LA MATRIZ: Usamos sc.next() para leer palabra por palabra
        String[][] matriz = new String[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.next();
            }
        }

        // Limpiamos el salto de línea que queda suelto antes de leer la última línea completa
        sc.nextLine();

        // 2. LEER LA SECUENCIA DE PALABRAS
        String cadena = sc.nextLine();
        String palabras[] = cadena.split(" "); // Hacemos el split fuera del bucle para ahorrar memoria

        // 3. COMPARAR E IMPRIMIR
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                // Imprimimos el inicio de la línea de salida (ej: "casa: ")
                System.out.print(matriz[i][j] + ": ");

                // Buscamos qué palabras de la secuencia están contenidas en la palabra de la matriz
                for(String palabra : palabras){
                    if(matriz[i][j].contains(palabra)){
                        System.out.print(palabra + " ");
                    }
                }
                // Hacemos el salto de línea al terminar cada palabra de la matriz
                System.out.println("");
            }
        }
        sc.close();
    }
}


/**
 * import java.util.Locale;
 * import java.util.Scanner;
 *
 * public class unadinslaltrav2 {
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         sc.useLocale(Locale.ENGLISH);
 *
 *         int f = sc.nextInt();
 *         int c = sc.nextInt();
 *
 *         // Llenar matriz de String:
 *         String[][] matriz = new String[f][c];
 *         for (int i = 0; i < f; i++) {
 *             for (int j = 0; j < c; j++) {
 *                 matriz[i][j] = sc.nextLine();
 *             }
 *         }
 *
 *         String cadena = sc.nextLine();
 *
 *         for (int i = 0; i < f; i++) {
 *             String palabras[] = cadena.split(" ");
 *             for (int j = 0; j < c; j++) {
 *                 for(String palabra : palabras){
 *                     if(matriz[i][j].contains(palabra)){
 *                         System.out.print(matriz[i][j]+": "+palabra+" ");
 *                     }
 *                 }
 *                 System.out.println("");
 *             }
 *         }
 *     }
 * }
 * /**
 *  sc.nextLine(); // consumir el salto de línea que queda
 *  String linea = sc.nextLine(); // última línea con todas las palabras
 *  String[] palabras = linea.split(" ");
 *
 *  for (int i = 0; i < f1; i++) {
 *  for (int j = 0; j < c1; j++) {
 *  char letra = matriz1[i][j];
 *  int contador = 0;
 *
 *  for (int p = 0; p < palabras.length; p++) {
 *  String palabra = palabras[p];
 *  for (int k = 0; k < palabra.length(); k++) {
 *  if (palabra.charAt(k) == letra) {
 *  contador++;
 *  }
 *  }
 *  }
 *
 *  System.out.println(letra + " " + contador);
 *  }
 *  }
 *  */