import java.util.Scanner;

public class Adicao1{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;
		int soma;

		System.out.print("Digite o primeiro número: ");
		numero1 = input.nextInt();

		System.out.print("Digite o segundo número: ");
		numero2 = input.nextInt();

		soma = numero1 + numero2;

		System.out.printf("%d + %d = %d\n", numero1, numero2, soma);

	}
}
