/*14. Escrever um programa para ler um valor inteiro e verificar se este valor é par ou 
ímpar.
 */

import java.util.Scanner;
import java.util.Locale;

public class ex14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva um numero inteiro:");
        int num = Integer.parseInt(ler.nextLine());

        if(num % 2 == 0){
            System.out.println("O numero e par!");
        }else{
            System.out.println("O numero e impar!");
        }
    }
}
