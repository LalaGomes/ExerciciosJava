package Lista07;

import java.util.Scanner;

/*2. Escreva um programa que leia um número inteiro positivo e calcule o seu fatorial. */

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro positivo:");
        int numero = ler.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);

    }
}
