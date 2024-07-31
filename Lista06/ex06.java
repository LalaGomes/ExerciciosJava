package Lista06;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = ler.nextInt();
        int a = 0, b = 1, c = 0;

        if (num == 0) {
            c = 0;
        } else if (num == 1) {
            c = 1;
        } else {
            for (int i = 2; i <= num; i++) {
                c = a + b; 
                a = b; 
                b = c; 
            }
        }
        System.out.println("O elemento na posição " + num + " da sequência de Fibonacci é: " + c);

    }
}
