// 06. Ler uma medida de tempo em segundos, calcular e escrever a medida 
// correspondente em horas, minutos e segundos.

import java.util.Scanner;
import java.util.Locale;

public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva uma medida de tempo em segundos acima de 60:");
        int seg = Integer.parseInt(ler.nextLine());

        // int calc1 = (seg / 3600);
        // int calc2 = (calc1 * 3600);
        int temp = 0;

        if(seg >= 3600){
            temp = (seg / 3600);
        }
        if(seg >= 60){
            temp = (seg / 60);
        }

        System.out.println(temp);

    }
}
