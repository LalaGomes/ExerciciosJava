/*4. Peça ao usuário para inserir 5 números inteiros. Armazene esses números em um vetor. Use um laço for para imprimir os elementos do vetor em ordem inversa. */


package Lista08;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v[] = new int[5];
        int tamanho = 5;
        int indice = 0;

        while (indice < tamanho) {
            System.out.println("Digite um numero:");
            v[indice] = ler.nextInt();
            indice++;
        }

        for(int i = 4; i > 0; i--){
            System.out.println(v[i]);
        }

    }
    
    
}
