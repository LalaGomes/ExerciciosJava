/*8. Peça ao usuário para inserir 9 números inteiros. Armazene esses números em uma matriz bidimensional. Calcule e imprima a soma de cada linha e cada coluna da matriz.
  */


package Lista08;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite 9 números inteiros:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }
    }
}
