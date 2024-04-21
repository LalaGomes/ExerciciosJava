// Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é
// 2, 3 e 5. Fórmula para o cálculo da média final é 

import java.util.Scanner;
import java.util.Locale;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva a primeira nota: ");
        int n1 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva a segunda nota: ");
        int n2 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva a terceira nota: ");
        int n3 = Integer.parseInt(ler.nextLine());

        int calc = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

        System.out.println("Media final: " + calc);


    }
}
