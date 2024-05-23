/*Escreva um programa que leia 10 números pelo teclado e informe a média dos valores informados. */
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        int temp = 0;

        while (i < 10) {
            System.out.println("Escreva um número:");
            int num = ler.nextInt();
            
            temp += num;
            // System.out.println(soma);
            i++;
        }
        System.out.println(temp / 10);
    }
}
