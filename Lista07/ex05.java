package Lista07;

import java.util.Scanner;
import java.lang.Math;

/*5. Desenvolva um jogo de adivinhação onde o computador escolhe um número aleatório entre 1 e 100, e o usuário tem que tentar adivinhar. O programa deve dar dicas se o palpite do usuário é maior ou menor que o número escolhido. */

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Tente adivinhar o numero escolhido ente 1 e 100:");
        int advinha = ler.nextInt();
        double randomNumber = Math.random();
        int numeroAleatorio = (int) (randomNumber * 100) + 1;
        int i = 0;
        while (i <= numeroAleatorio) {
            if (advinha == numeroAleatorio) {
                System.out.println("Voce acertou!");
                break;
            }
            if (advinha < numeroAleatorio) {
                System.out.println("O número que voce escolheu e menor do que o que foi gerado, tente aumentar sua escolha");
                advinha = ler.nextInt();
            }else{
                System.out.println("O número que voce escolheu e maior do que o que foi gerado, tente diminuir sua escolha");
                advinha = ler.nextInt();
            }
            
            i++;
        }

        System.out.println("Numero aleatorio entre 1 e 100: " + numeroAleatorio);


    }
}
