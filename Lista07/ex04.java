package Lista07;

import java.util.Scanner;

/*4. Escreva um programa que leia uma palavra e verifique se ela é um palíndromo (palavra que lê-se da mesma forma de trás para frente). */

public class ex04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        String palavra = ler.nextLine();

        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        boolean ehPalindromo = true;
        int length = palavra.length();

        for (int i = 0; i < length / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(length - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
    
}
