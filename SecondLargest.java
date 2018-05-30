class SecondLargest{
	public static void main(String arh[]){
		int arr[]={15,20,10,35,18};
		int first,second,third=0;
			first=0;
			second=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]>first){
					third=second;
					second=first;
					first=arr[j];
				}
				
				else if(arr[j]>second){
					second=arr[j];
				}
				else if(arr[j]>third){
					third=arr[j];
				}
			}
			System.out.println("first : "+first+" second :"+ second+ "Third :"+ third);
		}
}

		
		
			