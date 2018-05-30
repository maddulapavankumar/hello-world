class Duplicate{
	public static void main(String arh[]){
		int arr[] = new int[]{2, 3, 5, 4, 6, 2, 4, 3, 5, 1, 4, 9, 2};
		int index=0;
		int arr2[]=new int[100];
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==arr[i])
					count++;
			}
			if(count==1){
				arr2[index]=arr[i];
				index++;
			}
			
		}
		for(int i=0;i<index;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}
