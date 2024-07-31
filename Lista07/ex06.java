package Lista07;

import java.util.Scanner;

/*6. Escreva um programa que exiba os 10 primeiros termos de uma Progressão Aritmética (PA), com a razão e o primeiro termo fornecidos pelo usuário. */

public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro termo da progressao aritimetica:");
        int primeiroTermo = ler.nextInt();

        System.out.println("Digite a razao da progressao aritimetica:");
        int razao = ler.nextInt();

        System.out.println("Os 10 primeiros termos da progressão aritmetica sao:");

        for (int i = 0; i < 10; i++) {
            int termo = primeiroTermo + i * razao;
            System.out.print(termo + " ");
        }
    }
}
