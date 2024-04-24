/*27. Faça um programa para ler: a descrição do produto (nome), a quantidade 
adquirida e o preço unitário. Calcular e escrever o total (total = quantidade 
adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total -
desconto), sabendo-se que:
Se quantidade <= 5 o desconto sera de 2%
Se quantidade > 5 e quantidade <= 10 o desconto será́de 3%
Se quantidade > 10 o desconto será́de 5% */

import java.util.Locale;
import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva o nome do produto:");
        String nome = ler.nextLine();
        System.out.println("Escreva a quantidade adquirida desse produto:");
        int quantidade = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o preco unitario do produto:");
        double preco = Double.parseDouble(ler.nextLine());

        double total = quantidade * preco;
        double desconto;

        if(quantidade <= 5){
            desconto = preco * 0.02;
            double totalaPagar = total - desconto;
            System.out.println("O valor total é de: " + total);
            System.out.println("Voce recebeu o desconto de 2%");
            System.out.println("Total: R$ " + totalaPagar);
        }
        if (quantidade > 5 && quantidade <= 10) {
            desconto = preco * 0.03;
            double totalaPagar = total - desconto;            
            System.out.println("O valor total é de: " + total);
            System.out.println("Voce recebeu o desconto de 3%");
            System.out.println("Total: R$ " + totalaPagar);
        }
        if (quantidade > 10) {
            desconto = preco * 0.05;
            double totalaPagar = total - desconto;
            System.out.println("O valor total é de: " + total);
            System.out.println("Voce recebeu o desconto de 5%");
            System.out.println("Total: R$ " + totalaPagar);
        }

    }
    
}
