//05. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
// dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano 
// com 365 dias e mês com 30 dias.

import java.util.Scanner;
import java.util.Locale;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva quantos anos inteiros você tem:");
        int anos = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva quantos meses inteiros você tem, excluindo os anos:");
        int meses = Integer.parseInt(ler.nextLine());
        System.out.println("Excluindo os anos e meses, escreva quantos dias inteiros você tem:");
        int dias = Integer.parseInt(ler.nextLine());

        int calculoanos = (anos * 365);
        int calculomeses = (meses * 30);

        System.out.println("Sua idade em dias é igual a: " + (calculoanos + calculomeses + dias));


    }
}
