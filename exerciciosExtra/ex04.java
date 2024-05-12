/*4) Escreva um programa em Java que leia um valor inteiro X. Em seguida apresente os 4 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso. */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva um valor inteiro:");
        int x = ler.nextInt();

        if (x % 2 != 0) {
            System.out.println(x);
        }
        if ((x + 2) % 2 != 0) {
            System.out.println(x + 2);
        }
        if ((x + 4 )% 2 != 0) {
            System.out.println(x + 4);
        }
        if ((x + 6) % 2 != 0) {
            System.out.println(x + 6);
        }
    }
}
