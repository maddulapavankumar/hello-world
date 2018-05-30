class FirstNonRepeating{
	public static void main(String args[]){
		String s=new String("pavanpanakurv");
		char[] ch=s.toCharArray();
		java.util.Arrays.sort(ch);
		char current=ch[0];
		int count=0;
		for(int i=0;i<ch.length;i++){
			 count=0;
			for(int j=0;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count++;
				}
			}
			if(count==1){
				System.out.println(ch[i]);
				break;
			}
		}
	}
}

			
				