import java.util.Scanner;

public class esborrarlletresv4 {
    public static void main(String[] args) {
//        String[][] matrizPalabras = {{"hola", "mundo", "que", "tal"},
//                                    {"pescado", "alfanumerico", "u", "verbatim"}};
//        int[][] matrizNumeros = {{2,0,5,1},
//                                 {6,11,9,3}};
        Scanner sc = new Scanner(System.in);
        int tam1 = sc.nextInt();
        int tam2 = sc.nextInt();

        String[][] matrizPalabras = new String[tam1][tam2];
        int[][] matrizNumeros = new int[tam1][tam2];
        // Leer matriz
        for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam2; j++) {
                matrizPalabras[i][j] = sc.next();
            }
        }
        // Leer matriz
        for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam2; j++) {
                matrizNumeros[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam2; j++) {
                String palabra = matrizPalabras[i][j];
                int numero = matrizNumeros[i][j];
                if(palabra.length() > numero){
                    System.out.print(palabra.substring(0, numero) + palabra.substring(numero + 1)+" ");
                }
                else System.out.print(palabra+" ");
            }
            System.out.println("");
        }
    }
}
//System.out.println(palabra.substring(0, numero) + palabra.substring(numero + 1));
/*
 for (int j = 0; j < palabra.toCharArray().length; j++) {
 int numero = matrizNumeros[i]
 }
 */