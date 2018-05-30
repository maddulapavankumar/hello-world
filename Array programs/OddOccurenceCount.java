class OddOccurenceCount{
	public static void main(String arh[]){
		int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==arr[i])
					count++;
			}
			if((count & 1)==1)
				System.out.print(" "+arr[i]);
		}
		int res=0;
		for(int i=0;i<arr.length;i++){
			res=res ^ arr[i];
		}
		if(res!=0)
			System.out.println();
			System.out.println(res);
	}
	
}
		



				
		