/*5. Crie um programa que peça ao usuário para inserir 10 números inteiros. Armazene esses números em um vetor. Conte e imprima quantos desses números são positivos e quantos são negativos. */


package Lista08;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v[] = new int[10];
        int tamanho = 10;
        int indice = 0;

        while (indice < tamanho) {
            System.out.println("Digite um numero:");
            v[indice] = ler.nextInt();
            indice++;
        }

        int negativos = 0;
        int positivos = 0;

        for (int i = 0; i < tamanho; i++) {
            if (v[i] > 0) {
                positivos++;
            } else if (v[i] < 0) {
                negativos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);

    }
    
}
