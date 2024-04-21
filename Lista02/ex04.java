/*4. Faça um programa que receba o salário de um funcionário e o percentual de aumento, 
calcule e mostre o valor do aumento e o novo salário. */

import java.util.Scanner;
import java.util.Locale;

public class ex04 {

    public static void main (String[] args) {
    	Scanner ler = new Scanner(System.in).useLocale(Locale.US);
    	
    	System.out.println("Informe o seu salario: ");
    	double salario = Double.parseDouble(ler.nextLine());
    	System.out.println("Informe o percentual de aumento: ");
    	double aumento = Double.parseDouble(ler.nextLine());
    	
    	double calc = aumento / 100;
    	double r = (salario * calc) + salario;
    	
    	System.out.println("Resultado: " + r);
    	
    }
    
    
}