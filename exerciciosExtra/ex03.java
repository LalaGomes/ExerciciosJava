/*3) Escreva um programa em Java que leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

0 - 2000,00 = Isento

2000,01 - 3000,00 = 8%

3000,01 - 4500,00 = 18%

>4500 = 28%

Lembre-se que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais. */

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
     public static void main(String[] args) {
        Scanner calcular = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu salario");
        double salario = calcular.nextDouble();
        double imposto_de_renda = 0;

        if(salario <= 2000.00){
            System.out.println("Você esta isento do imposto de renda");
        }else{
            if(salario >= 2000.01 && salario <= 3000.00){
                imposto_de_renda = (salario - 2000) * 0.08;
                System.out.printf("O valor do seu imposto_de_renda de renda será de: " + " " +  "%.2f", imposto_de_renda);
            }else{
                if(salario >= 3000.01 && salario <= 4500.00){
                    imposto_de_renda = 1000 * 0.08 + (salario - 3000) * 0.18;
                    System.out.printf("O valor final do seu imposto é de: R$" + "%.2f", imposto_de_renda);
                }else{
                    if(salario > 4500.00){
                        imposto_de_renda = 1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28;
                        System.out.printf("Seu imposto é de: R$ " + "%.2f", imposto_de_renda);
                    }
                }

            }
        }
    }
}
