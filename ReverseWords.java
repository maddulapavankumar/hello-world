import java.util.*;
class ReverseWords{
	public static void main(String arhs[]){
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(new StringBuffer(s).reverse().toString());
		while(st.hasMoreTokens()){
				System.out.println(new StringBuffer(st.nextToken()).reverse());
		}
	}
}

		
		