class Food{
	public static void main(String arg[]){
		Product p[] = new Product[3];
		Order orders[]=new Order[3];
		for(int i=0;i<p.length;i++){
			p[i]=new Product();
			System.out.println("Product"+ (i+1) + " Details");
			System.out.println("-----------------------------");
			p[i].acceptDetails();
			orders[i] = new Order();
			orders[i].placeOrder(p[i]);
		}
		
			
			
			
		
		
	}
}
