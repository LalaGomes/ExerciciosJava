/*26. Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro.
 */

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o primeiro valor(Inteiro):");
        int valor1 = ler.nextInt();
        System.out.println("Escreva o segundo valor(Inteiro):");
        int valor2 = ler.nextInt();
        ler.nextLine();

        if (valor1 > valor2) {
            System.out.println("Primeiro ee maior");
        }
        if (valor2 > valor1) {
            System.out.println("Segundo e maior");
        }
        if (valor1 == valor2) {
            System.out.println("Valores iguais");
        }
    }
    
}
