import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Informe o valor do saque com dois digitos: ");
		double valor = ler.nextDouble();

		double temp;

		int nota100 = 0;
		int nota50 = 0;
		int nota20 = 0;
		int nota10 = 0;
		int nota5 = 0;
		int nota2 = 0;

		int moeda_1 = 0;
		int moeda_50 = 0;
		int moeda_25 = 0;
		int moeda_10 = 0;
		int moeda_5 = 0;
		int moeda_01 = 0;

		// int centavos = (int) Math.round(valor * 100);

		// temp = valor;

		if (valor >= 100) {
			nota100 = (int) (valor / 100);
			valor %= 100;
			// valor -= Math.round(nota100 * 100);
		}
		if (valor >= 50) {
			// nota50 = temp / 50;
			// temp %= 50;
			nota50 = (int) (valor / 50);
			valor -= Math.round(nota50 * 50);
		}
		if (valor >= 20) {
			// nota20 = temp / 20;
			// temp %= 20;
			nota20 = (int) (valor / 20);
			valor -= Math.round(nota20 * 20);
		}
		if (valor >= 10) {
			// nota10 = temp / 10;
			// temp %= 10;
			nota10 = (int) (valor / 10);
			valor -= Math.round(nota10 * 10);
		}
		if (valor >= 5) {
			// nota5 = temp / 5;
			// temp %= 5;
			nota5 = (int) (valor / 5);
			valor -= Math.round(nota5 * 5);
		}
		if (valor >= 2) {
			// nota2 = temp / 2;
			// temp %= 2;
			nota2 = (int) (valor / 2);
			valor -= Math.round(nota2 * 2);
		}
		if (valor >= 1) {
			moeda_1 = (int) (valor / 1);
			// valor %= 1;
			valor -= (moeda_1 * 1);

		}
		if (valor >= 0.50) {
			moeda_50 = (int) (valor / 0.50);
			// valor %= 0.50;
			valor -= (moeda_50 * 0.50);
		}

		if (valor >= 0.25) {
			moeda_25 = (int) (valor / 0.25);
			// valor %= 0.25;
			valor -= (moeda_25 * 0.25);
		}
		if (valor >= 0.10) {
			moeda_10 = (int) (valor / 0.10);
			// valor %= 0.10;
			valor -= (moeda_10 * 0.10);
		}
		if (valor >= 0.05) {
			moeda_5 = (int) (valor / 0.05);
			// valor %= 0.05;
			valor -= (moeda_5 * 0.05);
		}
		if (valor >= 0.01) {
			moeda_01 = (int) (valor / 0.01);
			// valor %= 0.01;
			valor -= (moeda_01 * 0.01);

		}

		System.out.println("Notas:");
		System.out.printf("%d notas de 100\n", nota100);
		System.out.printf("%d notas de 50\n", nota50);
		System.out.printf("%d notas de 20\n", nota20);
		System.out.printf("%d notas de 10\n", nota10);
		System.out.printf("%d notas de 5\n", nota5);
		System.out.printf("%d notas de 2\n", nota2);
		System.out.printf("%d moedas de 1\n", moeda_1);
        System.out.printf("%d moedas de 50\n",  moeda_50);
		System.out.printf("%d moedas de 25\n", moeda_25);
		System.out.printf("%d moedas de 10\n", moeda_10);
        System.out.printf("%d moedas de 5\n", moeda_5);
        System.out.printf("%d moedas de 1\n", moeda_01);
	}

}