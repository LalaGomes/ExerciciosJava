/*5. Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de 
modo que o lado A representa o maior dos 3 lados. A seguir, determine o Ɵpo de 
triângulo que estes três lados formam, com base nos seguintes casos, sempre 
escrevendo uma mensagem adequada: 
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO 
se A2
 = B2 + C2
, apresente a mensagem: TRIANGULO RETANGULO 
se A2
 > B2
 + C2
, apresente a mensagem: TRIANGULO OBTUSANGULO 
se A2
 < B2
 + C2
, apresente a mensagem: TRIANGULO ACUTANGULO 
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO 
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES 
Entrada: 
Leia três valores de ponto flutuante de dupla precisão A(0 < A), B(0 < B) e C(0 < C). 
Saída: 
Imprima todas as classificações do triângulo especificado na entrada. 
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] lados = new double[3];
        System.out.println("Digite o valor de A:");
        lados[0] = ler.nextDouble();
        System.out.println("Digite o valor de B:");
        lados[1] = ler.nextDouble();
        System.out.println("Digite o valor de C:");
        lados[2] = ler.nextDouble();

        Arrays.sort(lados);
        for (int i = 0; i < lados.length / 2; i++) {
            double temp = lados[i];
            lados[i] = lados[lados.length - 1 - i];
            lados[lados.length - 1 - i] = temp;
        }

        double A = lados[0];
        double B = lados[1];
        double C = lados[2];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }

}
