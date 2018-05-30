import java.util.Arrays;
class Sort{
	public static void main(String arh[]){
		long startTime=System.nanoTime();
		int[] arr={4,2,6,1,8,3};
		int arr2[]=Arrays.copyOf(arr,arr.length);
		
		Arrays.sort(arr);
		long endTime=System.nanoTime();
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println("\nTime taken in nano seconds is "+(endTime-startTime));
		System.out.println();
		for(int j=0;j<arr2.length;j++){
		for(int i=0;i<arr2.length-1;i++){
			if(arr2[i]>arr2[i+1]){
				int temp;
				temp=arr2[i];
				arr2[i]=arr2[i+1];
				arr2[i+1]=temp;
			}
			
		}
		}
		for(int i:arr2){
			System.out.print(i+" ");
		}
		
		
		
		
	}
}
		
			
		