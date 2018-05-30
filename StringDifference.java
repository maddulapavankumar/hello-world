class StringDifference{
	public static void main(String s[]){
		String s1=new String("kumari");
		String s2=new String("kumar");
		StringBuffer s3=new StringBuffer();
		char c1[]=s1.toCharArray();
		char[] c2=s2.toCharArray();
		for(int i=0;i<c1.length;i++){
			int count=0;
			for(int j=0;j<c2.length;j++){
				if(c1[i]==c2[j])
					count++;
			}
			if(count==0)
				s3.append(c1[i]);
		}
		System.out.println(s3.toString());
	}
}

		
