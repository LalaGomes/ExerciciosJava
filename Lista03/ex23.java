/*23. Ler um valor e escrever se é positivo, negativo ou zero. */

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um valor:");
        int valor = Integer.parseInt(ler.nextLine());

        if (valor > 0) {
            System.out.println("O valor é positivo!");
        }
        if (valor == 0) {
            System.out.println("O valor e zero!");
        }
        if (valor < 0) {
            System.out.println("O valor é negativo!");
        }
    }
}
