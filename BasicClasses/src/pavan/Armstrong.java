package pavan;

public class Armstrong {
	private int num,rem,sum=0;
	public Armstrong(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	public void calculate(){
		String s = Integer.toString(num);
		int len=s.length();
		while(num>0){
			rem=num%10;
			sum=sum+(int)Math.pow(rem, len);
			num=num/10;
			
			
		}
		System.out.println(sum);
	}

}
