import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int minutos;
		double valorPagar = 50.00;

		System.out.print("Digite a quantidade de minutos usados: ");
		minutos = scanner.nextInt();

		if (minutos > 100) {
			valorPagar = valorPagar + (minutos - 100) * 2.0;
			System.out.printf("Valor total a pagar: %.2f", valorPagar);
		} else {
			System.out.printf("Valor total a pagar: %.2f", valorPagar);
		}
		scanner.close();
	}

}
