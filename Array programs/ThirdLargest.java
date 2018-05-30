class ThirdLargest{
	public static void main(String arh[]){
		int arr[]={1,20,5,6,16,10};
		int max1=arr[0],max2=max1,max3=max1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max1)
				max1=arr[i];
			else if(arr[i]>max2&&arr[i]<max1 )
				max2=arr[i];
			else if(arr[i]>max3&& arr[i]<max2)
				max3=arr[i];
		}
	System.out.println(" max1: "+max1+" max2: "+max2+" max3: "+max3);
	}
}

			
			