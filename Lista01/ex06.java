/*6. A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de 
Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 
anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N 
primeiros números dessa série. 
Entrada: 
Leia um valor inteiro N (0 < N < 46). 
Saída: 
Os valores devem ser mostrados na mesma linha, separados por um espaço em 
branco. Não deve haver espaço após o úlƟmo valor. */

import java.util.Scanner;

public class ex06 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número maior do que 0 e menor do que 46:");
        int N = ler.nextInt();
        
        int[] fibonacci = new int[N];
        
        if (N > 0) {
            fibonacci[0] = 0;
        }
        if (N > 1) {
            fibonacci[1] = 1;
        }
        
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                System.out.print(fibonacci[i]);
            } else {
                System.out.print(fibonacci[i] + " ");
            }
        }
    }
}

