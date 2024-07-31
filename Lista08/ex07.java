/*7. Crie um programa que peça ao usuário para inserir 10 números inteiros. Armazene esses números em um vetor. Use um laço para contar e imprimir quantas vezes cada número aparece no vetor.
  */


package Lista08;

import java.util.Scanner;

public class ex07 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = ler.nextInt();
        }

        int[] frequencia = new int[101]; 

        for (int i = 0; i < numeros.length; i++) {
            frequencia[numeros[i]]++;
        }

        System.out.println("Frequência dos números no vetor:");
        for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > 0) {
                System.out.println("Número " + i + " aparece " + frequencia[i] + " vezes.");
            }
        }
    }
    
}
