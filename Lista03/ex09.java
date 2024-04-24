// 09. Ler um valor de x (ponto-flutuante), calcular e escrever o valor de todas as 
// expressões abaixo, para este valor de x.
// a) 𝑦 = 𝑥3 + 5𝑥 7 + 2𝑥 9
// b) 𝑦 = 𝑠𝑒𝑛(𝑥) 𝑥
// c) 𝑦 = (1 + 1𝑥) 𝑥
// d) 𝑦 = √ln(|𝑥| + 1) + 𝑙𝑜𝑔2(|𝑥| + 1) ||||| y = Math.sqrt(log(Math.abs(x) + 1) + ((log(Math.abs(x) + 1) / log(2))
// e) 𝑦 = 𝑎𝑟𝑐𝑠𝑒𝑛(𝑥) + arccos (𝑥)


import java.lang.Math;
import java.util.Scanner;
import java.util.Locale;

public class ex09 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        double x = Double.parseDouble(ler.nextLine());

        //a) 𝑦 = 𝑥3 + 5𝑥 7 + 2𝑥 9

        double y = Math.pow(x, 3) + 5 * Math.pow(x, 7) + 2 * Math.pow(x, 9);

        //b) 𝑦 = 𝑠𝑒𝑛(𝑥) 𝑥
        System.out.println("Digite um valor real");
        x = ler.nextDouble();

        y = Math.sin(x) / x;
        System.out.println("O valor de seno (x) / x é: " + y);


        //c) 𝑦 = (1 + 1𝑥) 𝑥
        ///////NÃO SEI QUAL TA CORRETO//////
        y = (1 + 1 * x) / x;
        y = Math.pow((1 + 1 / x), x);


        //d) 𝑦 = √ln(|𝑥| + 1) + 𝑙𝑜𝑔2(|𝑥| + 1)  
        y = Math.sqrt(Math.log(Math.abs(x) + 1) + ((Math.log(Math.abs(x) + 1) / Math.log(2))));

        //e) 𝑦 = 𝑎𝑟𝑐𝑠𝑒𝑛(𝑥) + arccos (𝑥)
        y = Math.sin(x) + Math.acos(x);
    }
}
