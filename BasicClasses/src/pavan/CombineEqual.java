package pavan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CombineEqual {

	public CombineEqual() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		HashMap<String,Integer> h1=new HashMap<>();
		PairData[] p1=new PairData[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Data");
		for(int i=0;i<p1.length;i++){
			p1[i]=new PairData(sc.next(),sc.nextInt());
		}
		for(int i=0;i<5;i++){
			if(!(h1.containsKey(p1[i].name))){
				h1.put(p1[i].name, p1[i].number);
			}
			else{
				temp=h1.get(p1[i].name);
				h1.put(p1[i].name, p1[i].number+temp);
			}
			
		}
		Set s1=h1.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		
		sc.close();
	}

}
