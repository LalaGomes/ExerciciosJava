/*19. Escrever um programa para ler a quantidade de horas-aula dadas de dois 
professores e o valor por hora recebido por cada um(valores diferentes pois um 
deles é mestre e o outro é doutor). Mostrar na tela qual dos professores tem 
salário total maior. */

import java.util.Scanner;
import java.util.Locale;

public class ex19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva a quantidade de horas-aula dadas do professor (mestre):");
        int mestre = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva a quantidade de horas-aula dadas do professor (doutor):");
        int doutor = Integer.parseInt(ler.nextLine());
        System.out.println("Escreva o valor das horas-aula do professor (mestre):");
        double valorM = Double.parseDouble(ler.nextLine());
        System.out.println("Escreva o valor das horas-aula do professor (doutor):");
        double valorD = Double.parseDouble(ler.nextLine());

        double calcM = (double) (mestre * valorM);
        double calcD = (double) (doutor * valorD);

        if (calcM > calcD) {
            System.out.println("O porfessor mestre tem o salario maior no valor de: R$ " + calcM);
        }
        else{
            System.out.println("O doutor tem o salario maior no valor de: R$ " + calcD);
        }
    }
}
