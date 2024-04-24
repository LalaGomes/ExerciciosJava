/*20. Escrever um programa para ler duas notas de um aluno e escrever na tela a 
palavra “Aprovado” se a média das duas notas for maior ou igual a 7,0. Caso a 
média seja inferior a 7,0, o programa deve ler uma nova nota relativa ao Exame 
Final e calcular e imprimir o resultado com a média final. Se esta média for maior 
ou igual a 7,0, o programa deve escrever “Aprovado” com a nota Fixa 6, caso 
contrário deve escrever "Reprovado". */

import java.util.Locale;
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva a primeira nota:");
        double nota1 = Double.parseDouble(ler.nextLine());
        System.out.println("Escreva a segunda nota:");
        double nota2 = Double.parseDouble(ler.nextLine());

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        }
        else{
            if(media < 7){
                System.out.println("Escreva sua nota relativa ao exame final:");
                double notaFinal = Double.parseDouble(ler.nextLine());
                
                double mediaFinal = (media + notaFinal) / 2;

                if (mediaFinal >= 7.0){
                    System.out.println("Aprovado com nota fixa 6");
                }
                else{
                    System.out.println("Reprovado");
                }
            }
        }
    }
}
