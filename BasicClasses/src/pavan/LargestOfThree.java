package pavan;

public class LargestOfThree {
	private int a,b,c;
	public LargestOfThree(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void calculate(){
		if(a>b && a>c)
			System.out.println(a);
		else if(b>a && b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}

}
