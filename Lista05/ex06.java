/*Escreva um programa que leia um número pelo teclado e mostre o elemento da sequência de Fibonacci que está na posição representada pelo número lido. A sequência de Fibonacci é definida como f(1) = 1, f(2) = 1 ... f(n) = f(n-1)+f(n-2). */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = ler.nextInt();
        int a = 0, b = 1, c = 0;

        if (num == 0) {
            c = 0;
        } else if (num == 1) {
            c = 1;
        } else {
            int i = 2; 
            while (i <= num) {
                c = a + b; 
                a = b; 
                b = c; 
                
                i++; 
            }
        }
        System.out.println("O elemento na posição " + num + " da sequência de Fibonacci é: " + c);

    }
}
