package Lista07;

import java.util.Scanner;

/*7. Desenvolva um programa que verifique se um número é perfeito. Um número é perfeito se a soma de seus divisores (excluindo ele mesmo) é igual ao próprio número. */

public class ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = ler.nextInt();
        int soma = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        if (soma == numero) {
            System.out.println("O número " + numero + " é perfeito.");
        } else {
            System.out.println("O número " + numero + " não é perfeito.");
        }
    }
}
