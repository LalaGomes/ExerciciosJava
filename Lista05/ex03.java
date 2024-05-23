/*Escreva um programa que solicite que o usuário informe um número inteiro maior que 20 e mostre na tela todos os divisores do número informado. Todos os valores devem ser mostrados na mesma linha, separador por tabulação (“\t”). */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva um numero inteiro maior do que 20:");
        int num = ler.nextInt();
        int i = 1;

        while (i <= num) {
            if(num % i == 0){
                System.out.print(i + "\t");
            }

            i++;
        }
        
    }
    
}
