/*5. Faça um programa que receba o salário base de um funcionário, calcule e mostre o 
salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário 
base e paga imposto de 7% sobre este salário. */

import java.util.Scanner;
import java.util.Locale;

public class ex05 {

    public static void main(String[] args) {
    	Scanner calculo = new Scanner(System.in).useLocale(Locale.US);
    	
    	System.out.println("Informe seu salario bruto: ");
    	double salario = Double.parseDouble(calculo.nextLine());
    	
    	double gratificacao = salario * 0.5;
    	double imposto = salario * 0.7;
    	
    	double r = (salario + gratificacao) - imposto;
    	
    	System.out.println("Resultado: " + r);
    }
    
    
}