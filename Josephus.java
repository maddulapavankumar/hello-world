import java.util.*;
class Josephus{
	public static void main(String arh[])	
	{
		int count,striked=0;
		System.out.println("enter the boy's name here");
		Scanner sc = new Scanner(System.in);
		String boy=new String();
		String girl=new String();
		boy=sc.next();
		System.out.println("enter the girl's name here");
		girl=sc.next();
		char s1[]=boy.toCharArray();
		char s2[]=girl.toCharArray();
		for(int i=0;i<boy.length();i++){
			for(int j=0;j<girl.length();j++){
				if(s1[i]==s2[j]){
					s2[j]=0;
					striked++;
					break;
				}
			}
		}
		int p=girl.length();
		int q=boy.length();
		System.out.println("the  striked is "+(2*striked));
		count=(p+q-2*striked);
		System.out.println("the total count after taking common characters are: "+count);
		
		
		calculateFlames(count,6);
		
	}
	public static void calculateFlames(int count,int flamecount)
	{
		if(flamecount==1){
			return 1;
		}
		else{
			return calculateFlames(((count,flamecount-1)+(count-1))%flamecount+1);
	}
	
}

		
		
		
		
		