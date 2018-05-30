import java.util.Scanner;
class Order{
	private int orderid;
	private double qty,total,price;
	
	public void placeOrder(Product p){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter orderid and quantity");
		orderid = sc.nextInt();
		qty = sc.nextDouble();
		price = p.getPrice();
		total = qty * price;
		System.out.println("Total is " + total); 
	}
}

		
		