// 3 - Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um
// valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no
// qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2.
// As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação
// de notas necessárias.
// Entrada:
// Leia um valor de ponto flutuante N (0 = N = 1000000.00).
// Saída:
// Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor
// inicial, conforme exemplo fornecido.
// Obs: Ultize ponto (.) para separar a parte decimal.

// Como resolvi (se o valor for maior ou igual o valor da nota) vou dividir e pega o resto da divisão inteira
// assim consigo ver quantas vezes a nota de 100 cabe nesse valor, pra assim eu ter a quantidade de notas que 
// devo devolver. 
// Curiosidade: Para converter um dado e so adicionar o tipo antes da variavel que sera convertida exemplo: linha 43
// converti o resutado da divisão para pear so a parte inteira 

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class exnat{
    public static void main(String[] args) {
        Scanner calcular = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um numero com duas casas decimais: ");
        double valor = calcular.nextDouble();

        int nota_100 = 0;
        int nota_50 = 0;
        int nota_20 = 0;
        int nota_10 = 0;
        int nota_5 = 0;
        int nota_2 = 0;

        int moeda_1 = 0;
        int moeda_50 = 0;
        int moeda_25 = 0;
        int moeda_10 = 0;
        int moeda_5 = 0;
        int moeda_01 = 0;

        if (valor >= 100) {
            nota_100 = (int)(valor / 100);
            // valor %= 100;
            valor -= Math.round(nota_100 * 100);
            System.out.println(nota_100 + "\t " + valor);
        }
        if (valor >= 50) {
            nota_50 = (int)(valor / 50);
            // valor %= 50;
            valor -= (nota_50 * 50);
            System.out.println(nota_50 + "\t " + valor);
        }
        if (valor >= 20) {
            nota_20 = (int)(valor / 20);
            // valor %= 20;
            valor -= (nota_20 * 20);
            System.out.println(nota_20 + "\t " + valor);
        }
        if (valor >= 10) {
            nota_10 = (int)(valor / 10);
            // valor %= 10;
            valor -= (nota_10 * 10);
            System.out.println(nota_10 + "\t " + valor);
        }
        if (valor >= 5) {
            nota_5 = (int)(valor / 5);
            // valor %= 5;
            valor -= (nota_5 * 5);
            System.out.println(nota_5 + "\t " + valor);
        }
        if (valor >= 2) {
            nota_2 = (int)(valor / 2);
            // valor %= 2;
            valor -= (nota_2 * 2);
            System.out.println(nota_2 + "\t " + valor);
        }
        if (valor >= 1) {
            moeda_1 = (int)(valor / 1);
            // valor %= 1;
            valor -= (moeda_1 * 1);
            System.out.println(moeda_1 + "\t " + valor);
        }
        if (valor >= 0.50) {
            moeda_50 = (int)(valor / 0.50);
            // valor %= 0.50;
            valor -= (moeda_50 * 0.50);
            System.out.println(moeda_50 + "\t " + valor);
        }
        
        if (valor >= 0.25) {
            moeda_25 = (int)(valor / 0.25);
            // valor %= 0.25;
            valor -= (moeda_25 * 0.25);
            System.out.println(moeda_25 + "\t " + valor);
        }
        if (valor >= 0.10) {
            moeda_10 = (int)(valor / 0.10);
            // valor %= 0.10;
            valor -= (moeda_10 * 0.10);
            System.out.println(moeda_10 + "\t " + valor);
        }
        if (valor >= 0.05) {
            moeda_5 = (int)(valor / 0.05);
            // valor %= 0.05;
            valor -= (moeda_5 * 0.05);
            System.out.println(moeda_5 + "\t " + valor);
        }
        if (valor >= 0.01){
            moeda_01 = (int)(valor / 0.01);
            // valor %= 0.01;
            valor -= (moeda_01 * 0.01);
            
            System.out.println(moeda_01 + "\t " + valor);
        } 
            System.out.println("Seu troco deste valor e:");
            System.out.println("Quantidades de notas de R$100 reais são :" + "" + nota_100);
            System.out.println("Quantidades de notas de R$50 reais são :" + "" + nota_50);
            System.out.println("Quantidades de notas de R$20 reais são :" + "" + nota_20);
            System.out.println("Quantidades de notas de R$10 reais são :" + "" + nota_10);
            System.out.println("Quantidades de notas de R$5 reais são :" + "" + nota_5);
            System.out.println("Quantidades de notas de R$2 reais são :" + "" + nota_2);
            System.out.println("Quantidades de moedas de 1 real são :" + "" + moeda_1);
            System.out.println("Quantidades de moedas de R$0.50 centavos são :" + "" + moeda_50);
            System.out.println("Quantidades de moedas de R$0.25 centavos são :" + "" + moeda_25);
            System.out.println("Quantidades de moedas de R$0.10 centavos são :" + "" + moeda_10);
            System.out.println("Quantidades de moedas de R$0.5 centavos são :" + "" + moeda_5);
            System.out.println("Quantidades de moedas de R$0.1 centavos são :" + "" + moeda_01);
        
    }
}