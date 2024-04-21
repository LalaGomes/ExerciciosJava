/*12. O custo de um carro novo é a soma do custo de fábrica com a porcentagem do 
distribuidor e dos impostos. Supondo que o percentual do distribuidor seja de 
28% e os impostos de 45%, escrever um programa para ler o custo de fábrica 
de um carro, calcular e escrever o custo final ao consumidor. */

import java.util.Scanner;
import java.util.Locale;

public class ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva o valor do custo de fábrica de um carro:");
        double custo = Double.parseDouble(ler.nextLine());

        double calcDistribuidor = (0.28 * custo) + custo;
        double imposto = (0.45 * custo) + custo;
        double total = (double) calcDistribuidor + imposto;

        System.out.println("O custo final do carro será: R$ " + total);
    }
    
}
