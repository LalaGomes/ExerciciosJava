package Lista07;

import java.util.Scanner;

/*9. Crie um programa que gere a sequência de Collatz para qualquer número inteiro positivo fornecido pelo usuário. O programa deve:

Solicitar ao usuário um número inteiro positivo.
Gerar e exibir a sequência de Collatz para o número fornecido.
Continuar até que a sequência chegue ao número 1. */

public class ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = ler.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            System.out.println("Sequência de Collatz para " + numero + ":");
            while (numero != 1) {
                System.out.print(numero + " ");
                if (numero % 2 == 0) {
                    numero /= 2;
                } else {
                    numero = 3 * numero + 1;
                }
            }
            
            System.out.print(1);
        }
    }
}
