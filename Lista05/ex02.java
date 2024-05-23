/*Escreva um programa que leia 10 números pelo teclado e, após a leitura, informe o menor e o maior número informado. */

import java.util.Scanner;
// import java.lang.Math;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0;

        System.out.println("Escreva um número:");
        int maior = ler.nextInt();
        int menor = maior;

        while (i < 10) {
            System.out.println("Escreva um número:");
            int num = ler.nextInt();
            if(num > maior){
                maior = num;
            }
            else {
                if (num < menor) {
                    menor = num;
                }
            }

            // temp += num;
            // temp = Math.max(temp, temp);
            // temp = Math.min(temp, temp);
            // System.out.println(temp);
            i++;
        }
        System.out.println("O maior numero e: " + maior + "\nO menor numero e: "+ menor);
    }
}
