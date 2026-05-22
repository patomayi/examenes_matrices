import java.util.Scanner;

public class creuparellosenar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tam = sc.nextInt();

        int[][] matriz = new int[tam][tam];

        // Leer matriz
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean pos = sc.nextBoolean();
        int centro = tam / 2;
        boolean correcto = true;

        // Comprobar fila central
        for (int j = 0; j < tam; j++) {

            int valor = matriz[centro][j];

            if (pos) {
                // Deben ser pares
                if (valor % 2 != 0) {
                    correcto = false;
                    break;
                }
            } else {
                // Deben ser impares
                if (valor % 2 == 0) {
                    correcto = false;
                    break;
                }
            }
        }

        // Comprobar columna central
        if (correcto) {

            for (int i = 0; i < tam; i++) {

                int valor = matriz[i][centro];

                if (pos) {
                    // Deben ser pares
                    if (valor % 2 != 0) {
                        correcto = false;
                        break;
                    }
                } else {
                    // Deben ser impares
                    if (valor % 2 == 0) {
                        correcto = false;
                        break;
                    }
                }
            }
        }

        System.out.println(correcto);

        sc.close();
    }
}