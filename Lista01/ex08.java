/*8. Na matemáƟca, um número perfeito é um número inteiro para o qual a soma de todos 
os seus divisores posiƟvos próprios (excluindo ele mesmo) é igual ao próprio número. 
Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é escrever um 
programa que imprima se um determinado número é perfeito ou não. 
Entrada: Leia um valor inteiro X (1 ≤ X ≤ 108), que pode ser ou não, um número 
perfeito. 
Saída: Para cada caso de teste de entrada, imprima a mensagem “X e perfeito” ou 
“X nao e perfeito”, de acordo com a especificação fornecida. 
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int x = ler.nextInt();
        
        int somaDivisores = 0;
        
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) { 
                somaDivisores += i;
            }
        }
        
        if (somaDivisores == x) {
            System.out.println(x + " e perfeito");
        } else {
            System.out.println(x + " nao e perfeito");
        }
    }
}
