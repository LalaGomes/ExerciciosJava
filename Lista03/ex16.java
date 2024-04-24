// 16 - Codifique um programa que leia um par ordenado (x, y) e informe a qual
// quadrante ele pertence

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner calcular = new Scanner(System.in);
        System.out.println("Digite o valor de x");
        double x = calcular.nextDouble();
        System.out.println("Digite o valor de y");
        double y = calcular.nextDouble();

        if(x >= 0 && y >= 0){
            System.out.println("Pertence ao primeiro quadrante");
        }else{
            if( x < 0 && y > 0){
            System.out.println("Pertence ao segundo quadrante");
            }else{
                if(x < 0  && y < 0){
                    System.out.println("Pertence ao terceiro quadrante");
                }else{
                    System.out.println("Pertence ao quarto quadrante");
                }
            }
        }
    }
}
