/*18. Escrever um programa que peça dois valores inteiros e imprima o menu com as 
opções: soma, diferença, produto, divisão, o resto da divisão, a potência (de um 
pelo outro) e a raiz quadrada de cada número lido. Vale lembrar que na divisão 
deve-se evitar o denominador zero. */

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class ex18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva um valor inteiro:");
        int num1 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva outro valor inteiro:");
        int num2 = Integer.parseInt(ler.nextLine());

        System.out.println("Escolha o que voce quer fazer: \n 1. Soma \n 2. Diferenca \n 3. Produto \n 4. Divisao \n 5. Resto da Divisao \n 6. Potencia \n 7. Raiz Quadrada");
        int escolha = Integer.parseInt(ler.nextLine());

        if (escolha == 1) {
            int soma = num1 + num2;
            System.out.println("O resultado da soma e: " + soma);
        }
        if (escolha == 2) {
            int diferença = num1 - num2;
            System.out.println("A diferenca dos numeros digitados e: " + diferença);
        }
        if (escolha == 3) {
            int produto = num1 * num2;
            System.out.println("O produto dos numeros digitados e: " + produto);
        }
        if (escolha == 4) {
            if(num2 == 0){
                System.out.println("NAO E DIVISIVEL POR ZERO");
            }
            else {
            int divisao = num1 / num2;
            System.out.println("A divisao dos numeros digitados e: " + divisao);
            }
        }
        if (escolha == 5) {
            int resto = num1 % num2;
            System.out.println("O resto da divisao e: " + resto);
        }
        if (escolha == 6) {
            double potencia = (double) Math.pow(num1, num2);
            System.out.println("A potencia dos numeros e: " + potencia);
        }
        if (escolha == 7) {
            double raiz1 = (double) Math.sqrt(num1);
            double raiz2 = (double) Math.sqrt(num2);
            System.out.printf("A raiz quadrada do primeiro número é: %.2f e a do segundo é: %.2f", raiz1, raiz2);
        }

    }
    
}
