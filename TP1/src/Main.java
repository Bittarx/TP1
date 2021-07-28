import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int selectedOption;
		String name;
		String address;
		String fone;
		int numberOfClients;
		String searchClient;
		String edit;
		int index;
		
		do {
		
		System.out.println("Digite o número da opção: ");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Buscar cliente ");
		System.out.println("3 - Cadastrar produto ");
		System.out.println("4 - Buscar produto ");
		System.out.println("5 - Cadastrar venda ");
		System.out.println("OU, caso queira sair, Digite 'Sair' ");
		
		selectedOption = input.nextInt();
		
		switch (selectedOption) {
		
		case 1: 
			System.out.println("Você selecionou Cadastrar cliente. ");
			System.out.println("Quantos clientes voê deseja cadastrar? ");
			
			numberOfClients = input.nextInt();
			
			input.nextLine();
			
			for(int i = 0; i != numberOfClients; ++i ) {
			

			System.out.println("Digite o Nome do cliente " + (i + 1) + ":");
			name = input.nextLine();
			
			System.out.println("Digite o endereço do cliente " + (i + 1) + ":");
			address = input.nextLine();
			
			System.out.println("Digite o telefone do cliente " + (i + 1) + ":");
			fone = input.nextLine();
			
			System.out.println("Cliente " + (i + 1) + " cadastrado");
			
			User actual = new User(name, address, fone);
			users.add(actual);
			
			}
			
			//System.out.println("O Nome do cliente é: " + users.get(0).getName());
			//System.out.println("O endereço do cliente é: " + users.get(0).getAddress());
			//System.out.println("O número do cliente é: " + users.get(0).getFone());

			break;
			
		case 2:
			input.nextLine();
			System.out.println("Você selecionou Buscar cliente. ");
			System.out.println("Qual o nome do cliente que você deseja buscar?");
			searchClient = input.nextLine();
			
			for(User obj : users) {
				
				if(obj.getName().equals(searchClient)) {
					
					
					System.out.println("Cliente encontrado. Os dados do cliente são: ");
					System.out.println("Nome do cliente: " + obj.getName());
					System.out.println("Endereço do cliente: " + obj.getAddress());
					System.out.println("Telefone do cliente: " + obj.getFone());
					System.out.println("deseja editar os dados do cliente? digite 's' para sim ou 'n' para não.");
					edit = input.nextLine();
					
					switch(edit) {
					
					case "s":
						
						System.out.println("deseja editar o nome do cliente? digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = users.indexOf(obj);
								User c  = users.get(index);
								System.out.println("Digite o novo nome do cliente: ");
								name = input.nextLine();
								c.setName(name);
								break;
								
							case "n":
								break;
								
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
						}
						
						System.out.println("deseja editar o endereço do cliente? digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = users.indexOf(obj);
								User c  = users.get(index);
								System.out.println("Digite o novo endereço do cliente: ");
								address = input.nextLine();
								c.setAddress(address);
								break;
								
							case "n":
								break;
								
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
						}
						
						System.out.println("deseja editar o telefone do cliente? digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = users.indexOf(obj);
								User c  = users.get(index);
								System.out.println("Digite o novo telefone do cliente: ");
								fone = input.nextLine();
								c.setFone(fone);
								break;
								
							case "n":
								break;
								
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
						}
						
					break;
					
					case "n":
						break;
						
					default :
						System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
					}
					
					
				}else {
					
					System.out.println("Cliente não encontrado!");

				}
				
			}
			
			break;
			
		
		}
		
		}while(selectedOption != 7);
		
	}

}
