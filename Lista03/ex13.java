/*13. Ler um valor inteiro e escrever a mensagem É MAIOR QUE 10! se o valor lido for 
maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!
 */

import java.util.Scanner;
import java.util.Locale;

public class ex13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva um valor inteiro:");
        int valor = Integer.parseInt(ler.nextLine());

        if(valor > 10){
            System.out.println("E MAIOR QUE 10!");
        }else{
            System.out.println("NAO E MAIOR QUE 10!");
        }
    }
    
}
