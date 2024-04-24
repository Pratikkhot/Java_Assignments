import java.util.Scanner;


public class Invoice{
	
	private String part_name;
	private String part_descprition;
	private int quantityPurchased;
	private double item_Price;
	private double total;
	
	
	public Invoice() // Constructor
	{
		System.out.println("Parameterless constructor called");
		
	 part_name = "Engine";
	 part_descprition = "V8 engine for ferrari";
	 quantityPurchased = 1;
	 item_Price = 50000;
	 total =0;
	}
	
		
		
	public Invoice(String part_name, String part_descprition, int quantityPurchased, double item_Price, double total) // Parameterized constructor
	{
		System.out.println("Parameterized constructor called");
	
		this.part_name = part_name;
		this.part_descprition = part_descprition;
		this.quantityPurchased = quantityPurchased;
		this.item_Price = item_Price;
		this.total = total;
	}

	public String getPart_name() {
		return part_name;
	}

	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}

	public String getPart_descprition() {
		return part_descprition;
	}

	public void setPart_descprition(String part_descprition) {
		this.part_descprition = part_descprition;
	}

	public int getQuantityPurchased() {
		return quantityPurchased;
	}

	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}

	public double getItem_Price() {
		return item_Price;
	}

	public void setItem_Price(double item_Price) {
		this.item_Price = item_Price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public double total()
	{
		return total = item_Price*quantityPurchased;
	}
	
	public void menu()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter part name: ");
		part_name=sc.nextLine();
		
		
		System.out.println("Enter part description");
		part_descprition=sc.nextLine();
		
		
		System.out.println("Enter quantity purchased: ");
		quantityPurchased= sc.nextInt();
		
		
		System.out.println("Enter item price");
		item_Price=sc.nextDouble();
		
		if(quantityPurchased<0 && item_Price<0)
		{
			setQuantityPurchased(0);
			setItem_Price(0);
		}
	}
	public void displayInvoice()
	{
		System.out.println("****************Zeus hardwares****************");
		System.out.println("Part name: "+part_name);
		System.out.println("Part description: "+part_descprition);
		System.out.println("Part quantity:"+quantityPurchased);
		System.out.println("item price:"+item_Price);
		System.out.println("Total bill: "+total()); 
		System.out.println("***********Thank you, visit us again :)*************** ");
		
	}
	
}
