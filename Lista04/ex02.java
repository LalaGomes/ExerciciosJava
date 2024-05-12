/*2) Faça um algoritmo que receba o nome e a idade de um paciente. De acordo com a idade do paciente, o mesmo será encaminhado ao médico especialista para atendê-lo, observando a tabela abaixo. Imprima o nome do paciente, a idade e a especialidade do médico que irá atendê-lo.

Idade

Especialidade

Até 12 anos

Pediatria

Acima de 12 anos até 59 anos

Clínica Geral

Acima de 60 anos

Geriatria */



package Lista04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();
        // ler.nextLine();

        if(idade <= 12){
            System.out.printf("%s, %s  anos:\nVoce sera atendido na especialidade de Pediatria!", nome, idade);
        }
        if (idade > 12 && idade < 59) {
            System.out.printf("%s,  %s  anos:\nVoce sera atendido na especialidade de Clinica Geral!", nome, idade);
        }
        if (idade >= 60) {
            System.out.printf("%s, %s  anos:\nVoce sera atendido na especialidade de Geriatria!", nome, idade);
        }
    }
}
