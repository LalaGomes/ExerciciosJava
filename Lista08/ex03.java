/*3. Solicite ao usuário para inserir 20 números inteiros. Armazene esses números em um vetor. Utilize um laço for para separar e imprimir os números pares e ímpares.
 */


package Lista08;

import java.util.Scanner;

public class ex03 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = ler.nextInt();
        }

        System.out.println("Números pares:");
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
