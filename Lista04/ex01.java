/*1) Escreva um algoritmo que leia a idade de um candidato e a altura (em cm) e sexo ( Feminino = 1 e Masculino = 2 Em seguida, validar a situação da pessoa.
Se a altura for maior ou igual a 180 cm e a idade for superior a 16 anos e sexo for igual a 1 (Feminino) imprimir a mensagem "Apto a jogar no time Feminino Juvenil de Basquete.".
Se a altura for maior ou igual a 180 cm e a idade for superior a 16 anos e sexo for igual a 2 (Masculino) imprimir a mensagem "Apto a jogar no time Masculino Juvenil de Basquete".
Outros casos imprimir "Não apto". */

package Lista04;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva sua idade:");
        int idade = ler.nextInt();
        System.out.println("Escreva sua altura em cm:");
        int altura = ler.nextInt();
        System.out.println("Qual o seu sexo?\n1 para Feminino e 2 para Masculino:");
        int sexo = ler.nextInt();
        // ler.nextLine();

        if(altura >= 180 && idade > 16 && sexo == 1){
            System.out.println("Apto a jogar no time Feminino Juvenil de Basquete.");
            
        }
        else if (altura >= 180 && idade > 16 && sexo == 2) {
            System.out.println("Apto a jogar no time Masculino Juvenil de Basquete.");
        }else{
            System.out.println("Não apto");
        }

    }
    
}
