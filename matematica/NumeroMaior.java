import java.util.Scanner;

public class NumeroMaior{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.print("\nDigite o primeiro número: ");
		numero1 = input.nextInt();

		System.out.print("\nDigite o segundo número: ");
		numero2 = input.nextInt();

		System.out.println();

		if(numero1 > numero2)
			System.out.printf("%d é maior\n\n", numero1);

		if(numero2 > numero1)
			System.out.printf("%d é maior\n\n", numero2);

		if(numero1 == numero2)
			System.out.println("Os números são iguais\n");

	}
}
