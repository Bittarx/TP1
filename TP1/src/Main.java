import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int selectedOption;
		String name;
		String address;
		String number;
		
		System.out.println("Digite o número da opção: ");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Buscar cliente ");
		System.out.println("3 - Cadastrar produto ");
		System.out.println("4 - Buscar produto ");
		System.out.println("5 - Cadastrar venda ");
		System.out.println("OU, caso queira sair, Digite 'Sair' ");
		
		selectedOption = input.nextInt();
		
		if(selectedOption == 1) {
			System.out.println("Você selecionou Cadastrar cliente. ");
			
				input.nextLine();

			System.out.println("Digite o Nome do cliente: ");
			name = input.nextLine();
			
			System.out.println("Digite o endereço do cliente: ");
			address = input.nextLine();
			
			System.out.println("Digite o Número do cliente: ");
			number = input.nextLine();
			
			User actual = new User(name, address, number);
			users.add(actual);
			
			System.out.println("O Nome do cliente é: " + users.get(0).getName());
			System.out.println("O endereço do cliente é: " + users.get(0).getAddress());
			System.out.println("O número do cliente é: " + users.get(0).getfone());
		}
		
	}

}
