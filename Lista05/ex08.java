/*Escreva um programa que leia um número maior que 30 pelo teclado e informe todos os números entre 0 e o valor informado que são múltiplos de 2 ou 7. */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro maior do que 30:");
        int num = ler.nextInt();
        int i = 0;

        System.out.println("Os múltiplos de 2 ou 7 entre 0 e " + num + " são:");

        while (i <= num) {
            if (i % 2 == 0 || i % 7 == 0) {
                System.out.print(i + "\t");
            }
            i++;
        }
        
    }
}
