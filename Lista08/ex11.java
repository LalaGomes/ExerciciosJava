/*11. Peça ao usuário para inserir 10 números inteiros. Armazene esses números em um vetor e solicite ao usuário para inserir um valor de deslocamento. Utilize um laço para rotacionar o vetor para a direita pelo número de posições indicado pelo usuário. Imprima o vetor resultante. */


package Lista08;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = ler.nextInt();
        }

        System.out.println("Digite o valor de deslocamento:");
        int deslocamento = ler.nextInt();

        deslocamento = deslocamento % 10;

        int[] vetorRotacionado = new int[10];
        for (int i = 0; i < 10; i++) {
            vetorRotacionado[(i + deslocamento) % 10] = vetor[i];
        }

        System.out.println("Vetor rotacionado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorRotacionado[i] + " ");
        }
    }
}
