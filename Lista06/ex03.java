package Lista06;

import java.util.Scanner;

/*Escreva um programa que solicite que o usuário informe um número inteiro maior que 20 e mostre na tela todos os divisores do número informado. Todos os valores devem ser mostrados na mesma linha, separador por tabulação (“\t”). */


public class ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um número inteiro maior que 20:");
        int num = ler.nextInt();

        for(int i = 1; i <= num; i++){
            if (num % i == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
