import java.util.Scanner;

public class Aritimetica1{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;

		int soma;
		int subtracao;
		int multiplicacao;
		int divisao;
		int resto;

		System.out.print("\nDigite o primeiro número: ");
		numero1 = input.nextInt();

		System.out.print("\nDigite o segundo número: ");
		numero2 = input.nextInt();

		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		resto = numero1 % numero2;

		System.out.println();

		System.out.printf("%d + %d = %d\n", numero1, numero2, soma);
		System.out.printf("%d - %d = %d\n", numero1, numero2, subtracao);
		System.out.printf("%d x %d = %d\n", numero1, numero2, multiplicacao);
		System.out.printf("%d / %d = %d\n", numero1, numero2, divisao);
		System.out.printf("resto = %d\n\n", resto);

	}
}
