/*07. Ler um caractere, determinar e escrever o seu antecessor e seu sucessor na 
tabela ASCII. */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva um caractere:");
        char caractere = ler.nextLine().charAt(0);

        int antecessor = caractere - 1;
        char antecessorchar = (char) antecessor;
        int sucessor = caractere + 1;
        char sucessorchar = (char) sucessor;

        System.out.println("O antecessor de " + caractere + " na tabela ASCII é: " + antecessorchar);
        System.out.println("O sucessor de " + caractere + " na tabela ASCII é: " + sucessorchar);

    }
}
