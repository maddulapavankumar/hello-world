class Factorial{
	private int sum=1;
	private int num;
	public Factorial(int num){
		
		this.num=num;
	}
	public void calculate(){
		for(int i=1;i<=num;i++){
			sum*=i;
		}
		System.out.println("Factorial is"+ sum);
	}
}
