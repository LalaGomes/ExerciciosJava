/*6. Faça um programa que leia o valor de 4 produtos e informe o valor final que deverá ser 
pago pelo cliente de acordo com as seguintes regras:
a. O cliente pagará 100% do valor caso o total da compra seja menor ou igual do que 
R$100,00.
b. O cliente terá um desconto de 10% no valor do primeiro produto caso o valor total 
dos 4 produtos seja maior que R$100,00 e menor que R$200,00.
c. O cliente terá um desconto de 15% no valor dos dois primeiros produtos caso o 
valor total dos 4 produtos esteja entre R$200,00 e R$500,00.
d. O cliente terá 25% de desconto caso o valor total dos 4 seja maior que R$500,00 */

import java.util.Scanner;
import java.util.Locale;

public class ex06 {

    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in).useLocale(Locale.US);
    	
    	System.out.println("Informe o valor do primerio produto: ");
    	double produto1 = Double.parseDouble(ler.nextLine());
    	System.out.println("Informe o valor do segundo produto: ");
    	double produto2 = Double.parseDouble(ler.nextLine());
    	System.out.println("Informe o valor do terceiro produto: ");
    	double produto3 = Double.parseDouble(ler.nextLine());
    	System.out.println("Informe o valor do quarto produto: ");
    	double produto4 = Double.parseDouble(ler.nextLine());
    	
    	double total = produto1 + produto2 + produto3 + produto4;
    	double valorfinal;
    	
    	if(total <= 100){
    		valorfinal = total;
    		System.out.println("Voce pagara: " + total);
    	}else if(total > 100 && total < 200){
    		valorfinal = total - (produto1 * 0.10);
    		System.out.println("Voce pagara: " + valorfinal);
    	} else if(total >= 200 && total <= 500){
    		double desconto15 = (produto1 + produto2) * 0.15;
    		valorfinal =  total - desconto15;
    		System.out.println("Voce pagara: " + valorfinal);
    	}else if(total > 500){
    		valorfinal = total * 0.25;
    		System.out.println("Voce pagara: " + valorfinal);
    		
    	}
    	
    		
    }
    
    
}