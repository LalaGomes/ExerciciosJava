/*10. Escreva um programa para ler o número total de eleitores de um município, o 
número de votos brancos, nulos e válidos. Calcular e escrever o percentual que 
cada um representa em relação ao total de eleitores.
*/

import java.util.Scanner;
import java.util.Locale;

public class ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva o numero total de eleitores de um municipio:");
        int eleitores = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o numero total de votos brancos de um municipio:");
        int votosBrancos = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o numero total de votos nulos de um municipio:");
        int votosNulos = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o numero total de votos validos de um municipio:");
        int votosValidos = Integer.parseInt(ler.nextLine());


        double calcBrancos = ((double) votosBrancos / eleitores ) * 100;
        double calcNulos = ((double) votosNulos / eleitores ) * 100;
        double calcValidos = ((double) votosValidos / eleitores ) * 100;

        System.out.println("O percentual de votos brancos em relação ao total de eleitores é: " + calcBrancos + "%");
        System.out.println("O percentual de votos nulos em relação ao total de eleitores é: " + calcNulos + "%");
        System.out.println("O percentual de votos validos em relação ao total de eleitores é: " + calcValidos + "%");
        




    }
}
