package Lista07;

import java.util.Scanner;

/*8. Crie um programa que encontre todos os números primos em um intervalo fornecido pelo usuário. O programa deve:

Solicitar ao usuário o intervalo (número inicial e final).
Verificar e listar todos os números primos nesse intervalo. */

public class ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número inicial do intervalo:");
        int inicio = ler.nextInt();
        System.out.println("Digite o número final do intervalo:");
        int fim = ler.nextInt();

        if (inicio > fim) {
            System.out.println("O número inicial deve ser menor ou igual ao número final.");
        } else {
            System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");
            for (int i = inicio; i <= fim; i++) {
                boolean ehPrimo = true;

                if (i <= 1) {
                    ehPrimo = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            ehPrimo = false;
                            break;
                        }
                    }
                }

                if (ehPrimo) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
