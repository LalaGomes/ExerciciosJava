/*22. Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 
1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu 
salário total. */

import java.util.Locale;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva seu salario fixo:");
        double salario = Double.parseDouble(ler.nextLine());
        System.out.println("Escreva o valor das vendas efetuadas:");
        double vendas = Double.parseDouble(ler.nextLine());

        double comissao;
        // double comissão2 = (vendas * 0.05) + salario;

        if (vendas <= 1500) {
            comissao = vendas * 0.03;
            
        }
        else {
            comissao = vendas * 0.05;
        }

        double salarioTotal =  salario + comissao;

        System.out.printf("Seu salario total e: \nR$ %.2f ", salarioTotal);
    }
}
