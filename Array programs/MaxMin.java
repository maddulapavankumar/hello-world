import java.util.*;
class MaxMin{
	public static void main(String arh[]){
		long startTime=System.nanoTime();
		int[] arr={4,2,6,1,8,3};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		long endTime=System.nanoTime();
		System.out.println("Min andMax elemenrts are "+min+" "+ max);
		System.out.println("time taken in nano seconds is"+(endTime-startTime));
			
	}
	
}

