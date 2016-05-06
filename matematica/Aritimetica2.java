import java.util.Scanner;

public class Aritimetica2{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;

		int soma;
		int media;
		int produto;
		int maior;
		int menor;

		System.out.print("\nDigite o primeiro número: ");
		numero1 = input.nextInt();

		System.out.print("Digite o segundo número: ");
		numero2 = input.nextInt();

		System.out.print("Digite o terceiro número: ");
		numero3 = input.nextInt();

		soma = numero1 + numero2 + numero3;
		media = (numero1 + numero2 + numero3) / 3;
		produto = numero1 * numero2 * numero3;
		maior = numero1;
		menor = numero1;

		if(numero2 > numero1 && numero2 > numero3)
			maior = numero2;

		if(numero3 > numero1 && numero3 > numero2)
			maior = numero3;

		if(numero2 < numero1 && numero2 < numero3)
			menor = numero2;

		if(numero3 < numero1 && numero3 < numero2)
			menor = numero3;

		System.out.printf("\nsoma = %d\nmedia = %d\nproduto = %d\nmaior número = %d\nmenor número = %d\n\n", soma, media, produto, maior, menor);

	}
}

