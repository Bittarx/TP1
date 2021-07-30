
public class Product {
	
	private String productName;
	private String description;
	private double price;
	private double interest;
	private int stock;
	
	//Constructor
	
		public Product() {
			
		}
		
		
		public Product(String pName, String description, double price, double interest, int stock){
			this.productName = pName;
			this.description = description;
			this.price = price;
			this.interest = interest;
			this.stock = stock;
		}
		
		//Getters
		
		public String getProductName() {
			return productName;
		}
		
		public String getDescription() {
			return description;
		}
		
		public double getPrice() {
			return price;
		}
		
		public double getInterest() {
			return interest;
		}
		
		public int getStock() {
			return stock;
		}
		
		//setters
		
		public void setProductName(String productName) {
			this.productName = productName;
		}
		
		public void setDescription(String description) {
			this.description = description;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public void setInterest(double interest) {
			this.interest = interest;
		}
		
		public void setStock(int stock) {
			this.stock = stock;
		}

}
