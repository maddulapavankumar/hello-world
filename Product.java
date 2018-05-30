import java.util.Scanner;
class Product{
	private int id;
	private double price;
	private String name;
	
	public void acceptDetails(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id ,name,price");
		id=sc.nextInt();
		name=sc.next(); 
		price=sc.nextDouble();
	}
	public double getPrice(){
		return price;
	}
}
