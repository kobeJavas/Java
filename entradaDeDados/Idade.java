import java.util.Scanner;

public class Idade{

	public static void main(String[] args){

		Scanner inputIdade = new Scanner(System.in);

		int idade;

		System.out.print("Digite sua idade: ");
		idade = inputIdade.nextInt();

		System.out.printf("Sua idade é %d\n", idade);

	}
}
