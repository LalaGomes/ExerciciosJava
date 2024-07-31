/*10. Peça ao usuário para inserir dois vetores de 5 elementos cada. Armazene esses elementos em dois vetores. Utilize loops para encontrar e imprimir os elementos comuns aos dois vetores.
  */


package Lista08;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        // Solicitar ao usuário para inserir os elementos do primeiro vetor
        System.out.println("Digite 5 elementos para o primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = ler.nextInt();
        }

        // Solicitar ao usuário para inserir os elementos do segundo vetor
        System.out.println("Digite 5 elementos para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = ler.nextInt();
        }

        // Encontrar e imprimir os elementos comuns aos dois vetores
        System.out.println("Elementos comuns aos dois vetores:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (vetor1[i] == vetor2[j]) {
                    System.out.println(vetor1[i]);
                    break; // Evitar duplicidade na impressão
                }
            }
        }
    }
}
