import java.util.Scanner;

public class cercardinsseqv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filaM1 = sc.nextInt();
        int colM1 = sc.nextInt();
        int[][] matriz = new int[filaM1][colM1];

        // Leer matriz
        for (int i = 0; i < filaM1; i++) {
            for (int j = 0; j < colM1; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int filaM2 = sc.nextInt();
        int colM2 = sc.nextInt();

        int[][] matriz2 = new int[filaM2][colM2];

        // Leer matriz
        for (int i = 0; i < filaM2; i++) {
            for (int j = 0; j < colM2; j++) {
                matriz2[i][j] = sc.nextInt();

            }
        }
        // 3. Procesar: Buscar cada número de la matriz2 en la matriz1
        for (int i = 0; i < filaM2; i++) {
            for (int j = 0; j < colM2; j++) {
                int numeroABuscar = matriz2[i][j];
                int contador = 0;

                // Recorremos TODA la primera matriz para contar este número
                for (int r = 0; r < filaM1; r++) {
                    for (int c = 0; c < colM1; c++) {
                        if (matriz[r][c] == numeroABuscar) {
                            contador++;
                        }
                    }
                }

                // Imprimir el formato solicitado: "numero veces"
                System.out.println(numeroABuscar + " " + contador);
            }
        }

    }
}
