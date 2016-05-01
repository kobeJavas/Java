import java.util.Scanner;

public class Nome{

	public static void main(String[] args){

		Scanner inputNome = new Scanner(System.in);

		String nome;

		System.out.print("Digite seu nome: ");
		nome = inputNome.nextLine();

		System.out.printf("Seu nome é %s\n", nome);

	}
}
