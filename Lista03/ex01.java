// 0.1 Escrever um programa para ler um número inteiro e exibir seu sucessor e seu antecessor.

import java.util.Scanner;
import java.util.Locale;

public class ex01 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Escreva um numero:");
        int num = Integer.parseInt(ler.nextLine());

        int sub = num + 1;
        int adi = num - 1;

        System.out.println("O sucessor do numero: " + num + " e " + adi + " e o antecessor e: " + sub);
        
    }
    
}