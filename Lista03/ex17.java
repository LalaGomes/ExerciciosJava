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

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            int temp = num1;
            System.out.println(num1);
        }
        if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            int temp = num2;
            System.out.println(num2);
        }

    }
    
}
