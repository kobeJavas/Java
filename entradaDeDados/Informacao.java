import java.util.Scanner;

public class Informacao{

	public static void main(String[] args){

		Scanner inputString = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		String nome;
		String cidade;
		int idade;

		System.out.print("\nDigite seu nome: ");
		nome = inputString.nextLine();

		System.out.print("Digite sua idade: ");
		idade = inputInt.nextInt();

		System.out.print("Digite sua cidade: ");
		cidade = inputString.nextLine();

		System.out.println("\n\tDados do Usuário");
		System.out.println("\t----------------");
		System.out.printf("\nNome: %s\n", nome);
		System.out.printf("Idade: %d\n", idade);
		System.out.printf("Cidade: %s\n\n", cidade);

	}
}
