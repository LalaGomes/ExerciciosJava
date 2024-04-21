// Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius

import java.util.Scanner;
import java.util.Locale;

public class ex03 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva a temperatura em Fahrenheit: ");
        int temperatura = Integer.parseInt(ler.nextLine());

        int calc = (temperatura - 32) * 5 / 9;

        System.out.println("A temperatura em Celcius é: " + calc);

    }
}
