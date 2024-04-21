/**Leia 2 valores de ponto flutuante de dupla precisao A e B, que correspondem a 2 notas
de um aluno. 
A seguir, calcule a media do aluno, sabendo que a nota A tem peso 3.5 e a
nota B tem peso 7.5 (A soma dos pesos portanto e 11). Assuma que cada nota pode ir
de 0 ate 10.0, sempre com uma casa decimal.
Entrada:
Leia dois valores com uma casa decimal cada um.
Saida:
Imprima a mensagem "MEDIA" e a media do aluno conforme exemplo abaixo, com 5
digitos apos o ponto decimal e com um espaco em branco antes e depois da igualdade.
Utlize variaveis de dupla precisao (double) e como todos os problemas, nao esqueca de
imprimir o fim de linha apos o resultado. 
**/
import java.util.Locale;
import java.util.Scanner;

public class ex02 {
   
    public static void main(String[] args) {
    	Scanner calcular = new Scanner(System.in).useLocale(Locale.US);
    	
    	System.out.println("Escreva a primeira nota: ");
       	double nota1 = Double.parseDouble(calcular.nextLine());
       	System.out.println("Escreva a segunda nota: ");
       	double nota2 = Double.parseDouble(calcular.nextLine());
       	
       	double media;
       	
       	if((nota1 >= 10.0 || nota1 < 0) && (nota2 >= 10.0 || nota2 < 0)){
       		System.out.println("As notas so podem ir de 0 a 10.0");
       	}else {
       		media = (nota1 * 3.5 + nota2 * 7.5) / 11.0;
       		System.out.printf("MEDIA: " + String.format("%.5f", media));
       	}
    }
}
