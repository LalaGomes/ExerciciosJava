/*9. Os dados armazenados no computador estão em binário. Uma forma econômica de 
ver estes números é usar a base 16 (hexadecimal). 
Sua tarefa consiste em escrever um programa que, dado um número natural na base 
10, mostre sua representação em hexadecimal. 
Entrada: A entrada é um número inteiro posiƟvo V na base 10 (1 ≤ V ≤ 2x109
). 
Saída: A saída é o mesmo número V na base 16 em uma única linha (não esqueça do 
caractere de fim-de-linha). Use letras maiúsculas, conforme os exemplos. 
 */

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int v = ler.nextInt();
        
        String hex = Integer.toHexString(v).toUpperCase();
        
        System.out.println(hex);
    }
}
