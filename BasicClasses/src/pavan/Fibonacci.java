package pavan;

public class Fibonacci {
	private int num,a=0,b=1,c;
	public Fibonacci(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
		
	}
	
	public void calculate(){
		System.out.print(a+" "+b);
		for(int i=0;i<num-2;i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
