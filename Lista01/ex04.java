/*4. Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares 
entre eles. 
Entrada: 
Leia dois valores inteiros. 
Saída: 
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares 
que estão entre os valores fornecidos na entrada que deverá caber em um inteiro. */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um valor inteiro:");
        int x = ler.nextInt();
        System.out.println("Escreva outro valor inteiro:");
        int y = ler.nextInt();

        int soma = 0;

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) { 
                soma += i;
            }
        }

        System.out.println("A soma dos números ímpares entre " + x + " e " + y + " é: " + soma);
    }
    
}
