import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int primeiraEntrada = sc.nextInt();
		int segundaEntrada = sc.nextInt();

		int resultado = primeiraEntrada + segundaEntrada;

		System.out.println("Resultado: " + resultado);

		sc.close();

	}

}
