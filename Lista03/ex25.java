/*25. Ler o nome de 2 times e o número de gols marcados na partida (para cada time). 
Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a 
palavra EMPATE */

// import java.util.Locale;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o nome do primeiro time:");
        String time1 = ler.nextLine();
        System.out.println("Escreva o nome do segundo time:");
        String time2 = ler.nextLine();
        System.out.println("Escreva a quantidade de gols do primeiro time:");
        int golsTime1 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva a quantidade de gols do segundo time:");
        int golsTime2 = Integer.parseInt(ler.nextLine());

        if (golsTime1 > golsTime2) {
            System.out.printf("O time vencedor foi %s!", time1);
        }
        if (golsTime2 > golsTime1) {
            System.out.printf("O time vencedor foi %s!", time2);
        }
        if (golsTime1 == golsTime2) {
            System.out.println("EMPATE!");
        }
    }
}
