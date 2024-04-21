// 09. Ler um valor de x (ponto-flutuante), calcular e escrever o valor de todas as 
// expressões abaixo, para este valor de x.
// a) 𝑦 = 𝑥
// 3 + 5𝑥
// 7 + 2𝑥 9
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
        double x;

        System.out.println("Digite um valor real");
        x = ler.nextDouble();

        double y = Math.sin(x) / x;
        System.out.println("O valor de seno (x) / x é: " + y);
    }
}
