/*15. As maças custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 
1,00 se forem compradas pelo menos 12. Escreva um programa que leia o 
número de maças compradas, calcule e escreva o custo total da compra. */

import java.util.Scanner;
import java.util.Locale;

public class ex15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva o número de macas compradas:");
        int macas = Integer.parseInt(ler.nextLine());

        if (macas < 12) {
            double total = (double) (macas * 1.30);
            System.out.println("O custo total da compra foi: R$ " + total);
        }else{
            if (macas >= 12) {
               double total12 = (double) (macas * 1.00);
               System.out.println("O custo total da compra foi: R$ " + total12);
            }
        }
    }
}
