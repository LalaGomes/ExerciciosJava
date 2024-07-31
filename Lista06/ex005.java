package Lista06;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um numero:");
        int menor = ler.nextInt();
        System.out.println("Escreva um numero maior que o anterior:");
        int maior = ler.nextInt();

        for (int i = 0; i < maior; i++) {
            menor ++;
            if(menor % 2 == 0) {
                System.out.print(menor + "\t");
            }
        }
    }
}
