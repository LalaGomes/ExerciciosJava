/*Escreva um programa que leia 10 números pelo teclado e informe a média dos valores informados. */


package Lista06;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int temp = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Escreva um numero:");
            int num = ler.nextInt();

            temp += num;
        }
        System.out.println(temp / 10);

    }
}
