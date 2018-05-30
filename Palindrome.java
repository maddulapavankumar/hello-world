class Palindrome{
	public static void main(String args[]){
		String s=new String("madam");
		System.out.println("The given String is Palindrome: "+PalindromeCheck(s));
	}
	public static boolean PalindromeCheck(String s){
		String s1= new String(s);
		return new StringBuffer(s).reverse().toString().equals(s1);
	}
}
