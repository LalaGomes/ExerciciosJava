/*
6. Crie um vetor de 10 posições e preencha-o com números aleatórios entre 1 e 100. Use um laço para imprimir todos os elementos do vetor. Calcule e imprima a soma desses números. */

package Lista08;

import java.util.Random;

public class ex06 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Elementos do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            soma += numeros[i];
        }
    }
}
