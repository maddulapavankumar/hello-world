import java.util.HashMap;
import java.util.TreeMap;

public class RightLeftSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,1};
		int rsum,lsum;
		TreeMap<Integer,Integer> hmap=new TreeMap<>();
		for(int i=0;i<arr.length;i++){
			rsum=computeRSum(arr,i);
			hmap.put(i,rsum);
		}
	for(int i=0;i<arr.length;i++){
			lsum=computeLSum(arr,i);
			if(hmap.getOrDefault(i, null).equals(lsum)){
				System.out.println("Index is: "+i);
			}
		}
		

	}
	public static int computeRSum(int arr1[],int from){
		int sum=0;
		for(int i=from+1;i<arr1.length;i++){
			sum+=arr1[i];
		}
		return sum;
	}
	public static int computeLSum(int arr1[],int from){
		int sum=0;
		for(int i=from-1;i>=0;i--){
			sum+=arr1[i];
		}
		return sum;
	}

}
