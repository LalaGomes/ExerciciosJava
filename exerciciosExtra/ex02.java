/*2) Escreva um programa em Java que leia quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1, y1) e p2(x2, y2) e calcule a distância entre eles, mostrando o resultado com 4 casas decimais após a vírgula.*/
import java.util.Scanner;
import java.lang.Math;

public class ex02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva uma distância:");
        int x1 = ler.nextInt();
        System.out.println("Escreva uma distância:");
        int x2 = ler.nextInt();
        System.out.println("Escreva uma distância:");
        int y1 = ler.nextInt();
        System.out.println("Escreva uma distância:");
        int y2 = ler.nextInt();

        double distância = (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Resultado: %.4f", distância);

    }
}
