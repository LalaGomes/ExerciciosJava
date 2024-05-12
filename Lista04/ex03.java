/*3)  Faça um algoritmo que receba o nome do produto e o valor da compra.
De acordo com a tabela abaixo é calculado o preço de venda.
Imprima o nome do produto, valor da compra e o valor da venda.

Valor da Compra  Valor da Venda

Valor < 100,00 = Lucro de 70%

De 100,00 a 200,00 = Lucro de 50%

Acima de 200,00 = Lucro de 30% */

package Lista04;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Locale;

public class ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva o nome do produto:");
        String nome = ler.nextLine();
        System.out.println("Escreva o valor da compra:");
        double valor = ler.nextDouble();
        ler.nextLine();

        double valorVenda70 = valor * 0.70;
        double valorVenda50 = valor * 0.50;
        double valorVenda30 = valor * 0.30;

        if (valor < 100) {
            System.out.println("Lucro de 70%");
        }
        if (valor >= 100 && valor <= 200) {
            System.out.printf("Lucro de 50%", nome, valor);
        }
        if (valor > 200) {
            System.out.printf("Lucro de 30%", nome, valor);
        }
    }
}
