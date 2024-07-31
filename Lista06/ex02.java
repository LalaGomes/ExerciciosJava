package Lista06;
/*Escreva um programa que leia 10 números pelo teclado e, após a leitura, informe o menor e o maior número informado. */



import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Escreva um numero:");
        int maior = ler.nextInt();
        int menor = maior;

        for(int i = 0; i < 10; i++){
            System.out.println("Escreva um número:");
            int num = ler.nextInt();

            if (num > maior) {
                maior = num;
            }else{
                menor = num;
            }

        }

        System.out.println("O maior numero e: " + maior + "\nO menor numero e: "+ menor);
    }
}
