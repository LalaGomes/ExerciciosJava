/*24. Faça um programa para ler três valores inteiros e escrevê-los em ordem 
crescente. */

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira três valores separados por espaços:");
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        ler.nextLine();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Valores em ordem crescente: " + a + " " + b + " " + c);
    }
}
