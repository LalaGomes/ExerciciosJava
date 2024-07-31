/*2. Crie um programa que peça ao usuário para inserir 15 números inteiros. Armazene esses números em um vetor. Use um laço while para encontrar e imprimir o maior e o menor número do vetor. */

package Lista08;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade = 15;
        int[] valores = new int[quantidade];
        int maior = valores[0];
        int menor = valores[0];
        int i = 0;

        while (i < quantidade) {
            System.out.println("Digite um número inteiro:");
            valores[i] = ler.nextInt();
            i++;
        }

        i = 0;
        while (i < quantidade) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
            i++;
        }

        System.out.println("O maior valor e: " + maior);
        System.out.println("O menor valor e: " + menor);

    }
    
}
