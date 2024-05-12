/*1) Escreva um programa em Java que leia dois valores e calcule o valor a ser mostrado na tela seguindo a seguinte lógica:

Caso um dos valores lidos seja pelo menos o dobro do outro valor, o valor final deve ser o resto da divisão do maior pelo menor valor.
Do contrário, imprima o produto entre os dois valores lidos. */

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um valor:");
        int num1 = ler.nextInt();
        System.out.println("Escreva outro valor:");
        int num2 = ler.nextInt();
        ler.nextLine();

        // int calc1 = num1 + num1;
        // int calc2 = num2 + num2;

        if (num1 >= 2 * num2) {
            int div = num1 / num2;
            System.out.println("Divisao: " + div);
        }
        if (num2 >= 2 * num1) {
            int div = num1 / num2;
            System.out.println("Divisao: " + div);
        } else {
            int div = num2 * num1;
            System.out.println("Produto: " + div);
        }
    }
}
