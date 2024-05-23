/*Escreva um programa que leia dois números pelo teclado e mostre todos os números pares que estão no intervalo entre o menor e o maior número informados pelo usuário. */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um numero:");
        int menor = ler.nextInt();
        System.out.println("Escreva um numero maior que o anterior:");
        int maior = ler.nextInt();
        int i = 0;

        while (i < maior) {
            menor ++;
            if(menor % 2 == 0) {
                System.out.print(menor + "\t");
            }
            i ++;
        }
    }
    
}
