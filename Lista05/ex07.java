/*Elaborar um algoritmo que leia 15 valores inteiros. O algoritmo não poderá aceitar o número zero. Mostrar:
a) quantidade de números positivos

b) quantidade de números negativos

c) soma de todos os valores positivos

d) soma de todos os valores negativos */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quantidadePositivos = 0;
        int quantidadeNegativos = 0;
        int somaPositivos = 0;
        int somaNegativos = 0;
        int i = 0;

        while (i < 15) {
            System.out.println("Informe um valor inteiro (diferente de zero):");
            int num = ler.nextInt();

            if (num == 0) {
                System.out.println("Valor zero não é aceito. Tente novamente.");
                continue;
            }

            if (num > 0) {
                quantidadePositivos++;
                somaPositivos += num;
            } else {
                quantidadeNegativos++;
                somaNegativos += num;
            }

            i++;
        }

        System.out.println("Quantidade de números positivos: " + quantidadePositivos);
        System.out.println("Quantidade de números negativos: " + quantidadeNegativos);
        System.out.println("Soma de todos os valores positivos: " + somaPositivos);
        System.out.println("Soma de todos os valores negativos: " + somaNegativos);
    }
}
