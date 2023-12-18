import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro (número inteiro): ");
		int param1 = userInput.nextInt();

		System.out.println("Digite o segundo parâmetro (número inteiro): ");
		int param2 = userInput.nextInt();

		try {
			contar(param1, param2);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}

	static void contar(int param1, int param2) throws ParametrosInvalidosException {
		if (param1 <= param2)
			throw new ParametrosInvalidosException();

		int contagem = param1 - param2;

		for (int count = 1; count <= contagem; count++) {
			System.out.println("Imprimindo o número " + count);
		}
	}
}
