package Lista06;

/*Escreva um programa que solicite que o usuário informe um número inteiro maior que 100 e mostre na tela se o número lido é primo ou não. */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro maior do que 100:");
        int num = ler.nextInt();
        // int i = 0;

        for(int i = 0; i >= 0; i++) {
            if (num / num == 1 && num / 1 == num) {
                System.out.println("O numero e primo");
            }
        }

    }
}
