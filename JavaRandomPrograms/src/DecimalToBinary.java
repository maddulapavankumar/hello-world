import java.util.Stack;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		int n=432;
		
		while(n!=1){
			st.add(n%2);
			n=n/2;
		}
		st.add(1);
		while(!st.empty()){
			System.out.print(st.pop());
		}
	}

}
