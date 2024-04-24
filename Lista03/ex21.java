/*21. Escreva um programa que leia três valores para os lados de um triângulo. O 
programa deve verificar se os lados fornecidos formam realmente um triângulo, 
e caso esta condição seja verdadeira, se o triângulo é equilátero (todos lados 
iguais), isósceles (dois lados iguais) ou escaleno (todos lados diferentes).
 */

import java.util.Scanner;
import java.util.Locale;

public class ex21{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Escreva o valor de um lado do triangulo: ");
        int lado1 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o valor de um lado do triangulo: ");
        int lado2 = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o valor de um lado do triangulo: ");
        int lado3 = Integer.parseInt(ler.nextLine());

        if((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)){
            System.out.println("O triangulo é isosceles!");
        }
        if ((lado1 == lado2) && (lado2 == lado3)){
            System.out.println("O triangulo é equilatero!");
        }
        if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)) {
            System.out.println("O triangulo é escaleno!");
        }
    }
}