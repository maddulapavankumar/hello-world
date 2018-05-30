class StringRotation{
	public static void main(String args[]){
		String s1="abcd";
		String s2="dacb";
		String s3=s1+s1;
		if(s3.contains(s2)){
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
