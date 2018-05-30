import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Top3RepeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		HashMap<String,Integer> map=new HashMap<>();
		String s= new String("i am the one who am i and it is one of the greatest one and i am fond of it");
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()){
			String key=st.nextToken();
			if(!map.containsKey(key)){
				map.put(key, 1);
			}
			else{
				 count=map.get(key);
				 map.put(key, ++count);
			}
		}
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}

}
