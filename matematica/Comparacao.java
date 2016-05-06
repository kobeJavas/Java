import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.print("\nDigite o primeiro número: ");
		numero1 = input.nextInt();

		System.out.print("Digite o segundo número: ");
		numero2 = input.nextInt();

		System.out.println();

		if(numero1 == numero2)
			System.out.printf("%d é igual a %d\n", numero1, numero2);

		if(numero1 != numero2)
			System.out.printf("%d é diferente de %d\n", numero1, numero2);

		if(numero1 > numero2)
			System.out.printf("%d é maior que %d\n", numero1, numero2);

		if(numero1 < numero2)
			System.out.printf("%d é menor que %d\n", numero1, numero2);

		if(numero1 >= numero2)
			System.out.printf("%d é maior ou igual a %d\n", numero1, numero2);

		if(numero1 <= numero2)
			System.out.printf("%d é menor ou igual a %d\n", numero1, numero2);

		System.out.println();

	}
}
