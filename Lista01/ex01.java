/**
 *Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel
calcular”, caso haja uma divisão por 0 ou raiz de número negaOvo.
Entrada:
Leia três valores de ponto flutuante (double) A, B e C.
Saída:
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel
calcular". Caso contrário, imprima o resultado das raízes, com uma mensagem
conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem. 

**/
import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		
		Scanner calculo = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Escreva um numero: ");
		double a = Double.parseDouble(calculo.nextLine());
		System.out.println("Escreva um numero: ");
		double b = Double.parseDouble(calculo.nextLine());
		System.out.println("Escreva um numero: ");
		double c = Double.parseDouble(calculo.nextLine());
		
		double delta;
		delta = Math.pow(b,2) - (4 * a * c);
		
		if(delta < 0 || a == 0){
			System.out.println("Impossivel calcular");
		
		}else{
			double x1;
			double x2;
			x1 = (- b + Math.sqrt(delta))/(2 * a);
			x2 = (- b - Math.sqrt(delta))/(2 * a);
			
			System.out.println("Linha 1: " + String.format("%.2f", x1));
			System.out.println("Linha 2: " + String.format("%.2f", x1));
		}
		
	}

	
}