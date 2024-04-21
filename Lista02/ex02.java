/*2. Faça um programa que receba três notas, calcule e mostre a média aritmética entre
elas */

import java.util.Locale;
import java.util.Scanner;
// import java.lang.Math;

public class ex02 {

    public static void main(String[] args) {
    	Scanner calculo = new Scanner(System.in).useLocale(Locale.US);
    	
    	System.out.println("Escreva uma nota: ");
    	double a = Double.parseDouble(calculo.nextLine());
    	System.out.println("Escreva outra nota: ");
    	double b = Double.parseDouble(calculo.nextLine());
    	System.out.println("Escreva mais uma nota: ");
    	double c = Double.parseDouble(calculo.nextLine());
    	
    	double media = (a + b + c) / 3;
    	
    	System.out.println("MEDIA: " + media);
    	
    	
    	
    }
    
    
}