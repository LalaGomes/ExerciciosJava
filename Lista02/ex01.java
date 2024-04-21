/*1. Faça um programa que receba quatro números inteiros, calcule e mostre a soma
desses números. */

import java.util.Locale;
import java.util.Scanner;


public class ex01 {

    public static void main(String[] args) {
    	Scanner some = new Scanner(System.in).useLocale(Locale.US);
    	
    	System.out.println("Escreva um numero: ");
    	int a = some.nextInt();
    	System.out.println("Escreva outro numero: ");
    	int b = some.nextInt();
    	System.out.println("Escreva mais um numero: ");
    	int c = some.nextInt();
    	System.out.println("Escreva so mais um: ");
    	int d = some.nextInt();
    	
    	int soma = (a + b + c + d);
    	
    	System.out.println("RESULTADO: " + soma);
    
	}
}