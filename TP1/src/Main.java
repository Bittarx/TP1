import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		ArrayList<Product> products = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int selectedOption;
		String name;
		String address;
		String fone;
		int numberOfClients;
		int numberOfProducts;
		String searchClient;
		String edit;
		int index;
		String productName;
		String description;
		double price;
		double interest;
		int stock;
		String searchProduct;
		int edit5;
		
		//1
		name = "Anushka";
		address = "Berlin";
		fone = "6587";
		User user1 = new User(name, address, fone);
		users.add(user1);
		
		//2
		name = "Deva";
		address = "Luanda";
		fone = "1478";
		User user2 = new User(name, address, fone);
		users.add(user2);
		
		//3
		name = "Durga";
		address = "Berna";
		fone = "3256";
		User user3 = new User(name, address, fone);
		users.add(user3);
		
		//4
		name = "Indira";
		address = "Ponta Grossa";
		fone = "6503";
		User user4 = new User(name, address, fone);
		users.add(user4);
		
		//5
		name = "Lakshmi";
		address = "Belem";
		fone = "11598";
		User user5 = new User(name, address, fone);
		users.add(user5);
		
		//6
		name = "Mahara";
		address = "Cork";
		fone = "7532";
		User user6 = new User(name, address, fone);
		users.add(user6);
		
		//7
		name = "Dinesh";
		address = "Dublin";
		fone = "1475";
		User user7 = new User(name, address, fone);
		users.add(user7);
		
		//8
		name = "Hari";
		address = "Bray";
		fone = "2581";
		User user8 = new User(name, address, fone);
		users.add(user8);
		
		//9
		name = "Raj";
		address = "Tel-Aviv";
		fone = "12987";
		User user9 = new User(name, address, fone);
		users.add(user9);
		
		//10
		name = "Shankar";
		address = "Jerusalém";
		fone = "1556";
		User user10 = new User(name, address, fone);
		users.add(user10);
		
		productName ="Vacina";
		description = "Pfizer";
		price = 50;
		interest = 0.47;
		stock = 500;
		Product product1 = new Product(productName, description, price, interest, stock);
		products.add(product1);
		
		productName ="Carro";
		description = "te leva de um lugar ao outro";
		price = 50000;
		interest = 0.80;
		stock = 2;
		Product product2 = new Product(productName, description, price, interest, stock);
		products.add(product2);
		
		productName ="Computador";
		description = "Para Jogar";
		price = 5000;
		interest = 0.6;
		stock = 20;
		Product product3 = new Product(productName, description, price, interest, stock);
		products.add(product3);
		
		productName ="Cachorro";
		description = "Animal";
		price = 2000;
		interest = 0.7;
		stock = 98;
		Product product4 = new Product(productName, description, price, interest, stock);
		products.add(product4);
		
		productName ="Vaca";
		description = "Artiodátilo";
		price = 6000;
		interest = 0.33;
		stock = 6;
		Product product5 = new Product(productName, description, price, interest, stock);
		products.add(product5);
		
		productName ="Carne de Golfinho";
		description = "cetáceo";
		price = 5000;
		interest = 0.14;
		stock = 360;
		Product product6 = new Product(productName, description, price, interest, stock);
		products.add(product6);
		
		productName ="Vidro";
		description = "para janelas";
		price = 69;
		interest = 0.69;
		stock = 69;
		Product product7 = new Product(productName, description, price, interest, stock);
		products.add(product7);
		
		productName ="Relógio";
		description = "ver a hora";
		price = 875;
		interest = 0.72;
		stock = 35;
		Product product8 = new Product(productName, description, price, interest, stock);
		products.add(product8);
		
		productName ="Moto";
		description = "Para Dirigir";
		price = 8000;
		interest = 0.48;
		stock = 8;
		Product product9 = new Product(productName, description, price, interest, stock);
		products.add(product9);
		
		productName ="Coronavírus";
		description = "Gettin real";
		price = 0;
		interest = 1;
		stock = 553000;
		Product product10 = new Product(productName, description, price, interest, stock);
		products.add(product10);
		
		
		do {
		
		System.out.println("Digite o número da opção: ");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Buscar cliente ");
		System.out.println("3 - Cadastrar produto ");
		System.out.println("4 - Buscar produto ");
		System.out.println("5 - Cadastrar venda ");
		System.out.println("6 -  Mostrar produtos em estoque");
		System.out.println("7 - sair");;
		
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
			
			for(int  count = 0; count < users.size() ; count++) {
				
				if(users.get(count).getName().equals(searchClient)) {
					
					
					System.out.println("Cliente encontrado. Os dados do cliente são: ");
					System.out.println("Nome do cliente: " + users.get(count).getName());
					System.out.println("Endereço do cliente: " + users.get(count).getAddress());
					System.out.println("Telefone do cliente: " + users.get(count).getFone());
					System.out.println("deseja editar os dados do cliente? digite 's' para sim ou 'n' para não.");
					edit = input.nextLine();
					
					switch(edit) {
					
					case "s":
						
						System.out.println("deseja editar o nome do cliente? digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = users.indexOf(users.get(count));
								User c  = users.get(index);
								System.out.println("Digite o novo nome do cliente: ");
								name = input.nextLine();
								c.setName(name);
								break;
								
							case "n":
								break;
								
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
								break;
						}
						
						System.out.println("deseja editar o endereço do cliente? digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = users.indexOf(users.get(count));
								User c  = users.get(index);
								System.out.println("Digite o novo endereço do cliente: ");
								address = input.nextLine();
								c.setAddress(address);
								break;
								
							case "n":
								break;
								
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
								break;
						}
						
						System.out.println("deseja editar o telefone do cliente? digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = users.indexOf(users.get(count));
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
					
					
				}else if(!users.get(count).getName().equals(searchClient) & count == (users.size() - 1)) {
					
					System.out.println("Cliente não encontrado!");
					
				}
				
			}
			
			break;
			
		case 3:
			
			System.out.println("Você selecionou cadastrar Produto. ");
			System.out.println("Quantos produtos voê deseja cadastrar? ");
			
			numberOfProducts = input.nextInt();
			
			input.nextLine();
			
			for(int j = 0; j != numberOfProducts; ++j ) {
			

			System.out.println("Digite o Nome do produto " + (j + 1) + ":");
			productName = input.nextLine();
			
			System.out.println("Digite a descrição do produto " + (j + 1) + ":");
			description = input.nextLine();
			
			System.out.println("Digite o valor de compra do produto " + (j + 1) + " de acordo com o exemplo:");
			System.out.println("Ex: sete reais e cinquenta centavos = 7.50");
			price = Double.parseDouble(input.nextLine());
			
			System.out.println("Digite a porcentagem de lucro do produto " + (j + 1) + " de acordo com o exemplo:");
			System.out.println("Ex: 50% de lucro = 0.50");
			interest = Double.parseDouble(input.nextLine());
			
			System.out.println("Digite a quantidade do produto " + (j + 1) + " em estoque:");
			stock = input.nextInt();
			
			System.out.println("produto " + (j + 1) + " cadastrado");
			
			Product actualp = new Product(productName, description, price, interest, stock);
			products.add(actualp);
			
			}
			
			//System.out.println("O Nome do produto é: " + products.get(0).getProductName());
			//System.out.println("O endereço do cliente é: " + users.get(0).getAddress());
			//System.out.println("O número do cliente é: " + users.get(0).getFone());

			break;
			
		case 4:
			
			input.nextLine();
			System.out.println("Você selecionou Buscar produto. ");
			System.out.println("Qual o nome do produto que você deseja buscar?");
			searchProduct = input.nextLine();
			
			for(int  k = 0; k < products.size() ; k++) {
				
				if(products.get(k).getProductName().equals(searchProduct)) {
					
					
					System.out.println("Cliente encontrado. Os dados do produto são: ");
					System.out.println("Nome do produto: " + products.get(k).getProductName());
					System.out.println("Descrição do produto: " + products.get(k).getDescription());
					System.out.println("Valor de venda do produto: " + products.get(k).getPrice());
					System.out.println("Porcentagem de lucro do produto: " + products.get(k).getInterest());
					System.out.println("Quantidade do produto em estoque: " + products.get(k).getStock());
					System.out.println("deseja editar os dados do produto? Digite 's' para sim ou 'n' para não.");
					edit = input.nextLine();
					
					switch(edit) {
					
					case "s":
						
						System.out.println("deseja editar o nome do produto? digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = products.indexOf(products.get(k));
								Product c  = products.get(index);
								System.out.println("Digite o novo nome do produto: ");
								productName = input.nextLine();
								c.setProductName(productName);
								break;
								
							case "n":
								break;
								
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
						}
						
						System.out.println("deseja editar a descrição do produto? digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = products.indexOf(products.get(k));
								Product c  = products.get(index);
								System.out.println("Digite a nova descrição do produto: ");
								description = input.nextLine();
								c.setDescription(description);
								break;
								
							case "n":
								break;
								
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
						}
						
						System.out.println("deseja editar o valor de venda do produto? Digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = products.indexOf(products.get(k));
								Product c  = products.get(index);
								System.out.println("Digite o novo valor de compra do produto de acordo com o exemplo: ");
								System.out.println("Ex: sete reais e cinquenta centavos = 7.50");
								price = Double.parseDouble(input.nextLine());
								c.setPrice(price);
								break;
								
							case "n":
								break;
								
							
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
						}
						
						System.out.println("deseja editar a porcentagem de lucro do produto? Digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = products.indexOf(products.get(k));
								Product c  = products.get(index);
								System.out.println("Digite a nova porcentagem de lucro do produto de acordo com o exemplo: ");
								System.out.println("Ex: 50% de lucro = 0.50");
								interest = Double.parseDouble(input.nextLine());
								c.setInterest(interest);
								break;
								
							case "n":
								break;
								
							
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");
						}
						
						System.out.println("deseja editar a quantidade de produto no estoque? Digite 's' para sim ou 'n' para não.");
						edit = input.nextLine();
						
						switch(edit) {
							case "s":
								index = products.indexOf(products.get(k));
								Product c  = products.get(index);
								System.out.println("Digite a nova quantidade de produto em estoque: ");
								stock = input.nextInt();
								c.setStock(stock);
								break;
								
							case "n":
								break;
								
							
							default :
								System.out.print("Opção inválida. as opções válidas são 's' para sim e 'n' para não.");}
		
					}
		
				}else if(!users.get(k).getName().equals(searchProduct) & k == (users.size() - 1)) {
					
					System.out.println("Produto não encontrado!");
					
				}
		
			}
			
			break;
			
		case 5:
			
			System.out.println("Você selecionou cadastro de venda. ");
			System.out.println("Selecione o cliente digitando o número do mesmo: ");
			
			for(int  a = 0; a < users.size() ; a++) {
				
				System.out.println((a+1) + " - " + users.get(a).getName());
			}
			
			edit5 = input.nextInt();
			System.out.println("Você selecionou o cliente " + users.get((edit5 - 1)).getName());
			do {
				System.out.println("Selecione um produto digitando o número do mesmo: ");
					for(int  b = 0; b < users.size() ; b++) {
				
						System.out.println((b+1) + " - " + products.get(b).getProductName());
					}
			
					
					edit5 = input.nextInt();
					input.nextLine();
					System.out.println("Você selecionou o produto " + products.get((edit5 - 1)).getProductName());
					System.out.println("Deseja cadastrar mais um produto para esse cliente? digite 's' para sim ou 'n' para não");
					edit = input.nextLine();

			
			}while(!edit.equals("n"));
			
			System.out.println("venda realizada!");
			break;
			
		case 6:
			
			for(int  d = 0; d < users.size() ; d++) {
				
				System.out.println((d+1) + " - " + products.get(d).getProductName() + " " + products.get(d).getStock() + " " + "em estoque" );
			}
			break;
			
		case 7:
			break;
			
		default:
			System.out.print("Opção Inválida");

		}
		}while(selectedOption != 7);
		
		input.close();
	}
}
