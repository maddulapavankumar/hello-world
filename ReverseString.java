class ReverseString{
	public static void main(String arh[]){
		String s=new String("madhavi");
		String s1=reverseString(s);
		System.out.println(s1);
	}
	public static String reverseString(String s){
		StringBuffer sb=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}

			