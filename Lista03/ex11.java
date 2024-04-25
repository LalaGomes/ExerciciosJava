/*11. Escreva um programa para ler o salário mensal atual de um funcionário e o 
percentual de reajuste. Calcule e escreva o valor do novo salário. */

import java.util.Scanner;
import java.util.Locale;

public class ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva o seu salario atual:");
        double salario = Double.parseDouble(ler.nextLine());
        System.out.println("Escreva o percentual de reajuste:");
        double reajuste = Double.parseDouble(ler.nextLine());

        double valor = (salario * reajuste) + salario;

        System.out.println("O seu novo salario sera: R$ " + valor);
    }
}
