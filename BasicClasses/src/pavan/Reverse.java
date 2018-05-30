package pavan;

public class Reverse {
	private int num;
	private int rem,sum=0;
	
	public Reverse(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	public void calculate(){
		while(num>0){
			rem=num%10;
			sum=10*sum+rem;
			num=num/10;
			
		}
		System.out.println("The reverse is "+sum);
	}

}
