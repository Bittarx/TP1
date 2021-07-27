
public class User {
	
	private String name;
	private String address;
	private String fone;
	
	//Constructor
	
	public User() {
		
	}
	
	
	public User(String name, String address, String fone){
		this.name = name;
		this.address = address;
		this.fone = fone;
	}
	
	//Getters
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getfone() {
		return fone;
	}
}