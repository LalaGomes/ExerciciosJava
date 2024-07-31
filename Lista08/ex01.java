/*1. Peça ao usuário para inserir a quantidade de números que ele deseja armazenar. Em seguida, solicite os números e armazene-os em um vetor. Use um laço for para calcular e imprimir a média desses números. */

package Lista08;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja quardar:");
        int quantidade = ler.nextInt();
        int [] valores = new int[quantidade];
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um valor para a posição " + i + ":");
            valores[i] = ler.nextInt();
        }

        for(int i = 0; i < quantidade; i++){
            soma += valores[i];
        }

        double media = (double) soma / quantidade;
        
        System.out.println("A média dos valores inseridos é: " + media);
    }
    
}
