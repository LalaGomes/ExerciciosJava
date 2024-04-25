/*17. Escrever um programa para ler cinco valores inteiros e escrever na tela o maior 
e o menor deles. */

/////////////////// NÃO TERMINADO //////////////////////

import java.util.Locale;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva o primeiro valor inteiro:");
        int num1 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o segundo valor inteiro:");
        int num2 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o terceiro valor inteiro:");
        int num3 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o quarto valor inteiro:");
        int num4 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o quinto valor inteiro:");
        int num5 = Integer.parseInt(ler.nextLine());
        // int maior, menor;

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("O maior e: " + num1);
        }
        if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println("O maior e: " + num2);
        }
        if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("O maior e: " + num3);
        }
        if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println("O maior e: " + num4);
        }
        if(num5 > num1 && num5 > num1 && num5 > num3 && num5 > num4){
            System.out.println("O maior e: " + num5);
        }
                                /////MENORES/////

        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.println("O menor e: " + num1);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            System.out.println("O menor e: " + num2);
        }
        if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
            System.out.println("O menor e: " + num3);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3 && num1 < num5) {
            System.out.println("O menor e: " + num4);
        }
        if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
            System.out.println("O menor e: " + num5);
        }

        // if (num1 > num2) {
        //     maior = num1;
        // }
        // if (num2 > num3) {
        //     maior = num3;
        // }

    }
    
}
