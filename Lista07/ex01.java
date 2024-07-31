package Lista07;

import java.util.Scanner;

/*1. Crie um programa que solicite um número inteiro ao usuário e imprima a tabuada desse número de 1 a 10. */

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro:");
        int numero = ler.nextInt();
        ler.nextLine();
        int count = 1;

        for (int i = 1; i <= 10; i++){
            int multiplica = numero * count;
            System.out.println( numero + " x " + count + " = " + multiplica);

            // int divide = numero / count;
            // System.out.println( numero + " / " + count + " = " + divide);
            count ++;
        }
    }
    
}
