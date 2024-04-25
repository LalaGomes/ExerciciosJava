/*08. Ler um caractere maiúsculo de A a Z, determinar e escrever o caractere 
minúsculo correspondente.
*/

import java.util.Scanner;
// import java.util.Locale;
// import java.lang.Character;

public class ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva uma letra maiuscula de A a Z:");
        char letra = ler.nextLine().charAt(0);

        int minuscula = letra + 32;
        char asciimin = (char) minuscula;

        System.out.printf("O cacactere minusculo correspondente a %c sera: %c", letra, asciimin);
    }
}
