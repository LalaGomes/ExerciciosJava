package Lista07;

import java.util.Scanner;

/*3. Faça um programa que leia uma string e conte, separadamente, quantas vogais (a, e, i, o, u) ela contém.
*/

public class ex03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva uma palavra:");
        String str = ler.nextLine();
        str = str.toLowerCase();
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for(int i = 0;  i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a') {
                countA ++;
            }
            if (ch == 'e') {
                countE ++;
            }
            if (ch == 'i') {
                countI ++;
            }
            if (ch == 'o') {
                countO ++;
            }
            if (ch == 'u') {
                countU ++;
            }
        }
        
        System.out.println("Número de vogais 'a': " + countA);
        System.out.println("Número de vogais 'e': " + countE);
        System.out.println("Número de vogais 'i': " + countI);
        System.out.println("Número de vogais 'o': " + countO);
        System.out.println("Número de vogais 'u': " + countU);

    }
}
