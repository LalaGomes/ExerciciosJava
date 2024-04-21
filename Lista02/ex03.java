/*3. Faça um programa que receba o salário de um funcionário, calcule e mostre o novo 
salário, sabendo-se que este sofreu um aumento de 25% */

import java.util.Locale;
import java.util.Scanner;
// import java.lang.Math;

public class ex03 {

    public static void main (String[] args) {
    	Scanner calcular = new Scanner(System.in).useLocale(Locale.US);
    	
    	System.out.println("Informe o seu salario: ");
    	double salario = Double.parseDouble(calcular.nextLine());
    	
    	double valor = (salario * 0.25) + salario;
    	 
    	System.out.println("O seu salario sera: R$ " + valor);
    }
    
    
}