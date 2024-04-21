// 0.2 Escreva um programa para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo

import java.util.Scanner;
import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva a base do triangulo:");
        int base = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva a altura do triangulo:");
        int altura = Integer.parseInt(ler.nextLine());

        int calc = base * altura;

        System.out.println("A area do retangulo e: " + calc);




    }
}
