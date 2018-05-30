class RemoveDuplicate{
	public static void main(String arh[]){
		boolean found=false;
		
	int[] arr = new int[]{ 1, 3,3, 7, 7, 8, 9, 9, 9, 10};
	int current = arr[0];
	for(int i=0;i<arr.length;i++){
		if(current==arr[i] && found== false){
			System.out.print(arr[i]+" ");
			found=true;
		}
		else if(current==arr[i] && found==true){
			current=arr[i];
		}
		else if(current!=arr[i]){
			System.out.print(" "+arr[i]);
			current=arr[i];
		}
	}
	
	}
}

			
	
