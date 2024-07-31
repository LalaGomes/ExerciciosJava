/*7. Na matemáƟca, um Número Primo é aquele que pode ser dividido somente por 1 (um) 
e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas 
pelo número 1 e pelo número 7. 
Entrada: Leia um valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo. 
Saída: Para cada caso de teste de entrada, imprima a mensagem “X e primo” ou “X nao 
e primo”, de acordo com a especificação fornecida.  */

import java.util.Scanner;
import java.lang.Math;

public class ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int x = ler.nextInt();

        boolean isPrime = true;

        if (x <= 1) {
            isPrime = false;
        } else if (x == 2) {
            isPrime = true;
        } else if (x % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 3; i <= Math.sqrt(x); i += 2) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(x + " e primo");
        } else {
            System.out.println(x + " nao e primo");
        }
}

}
