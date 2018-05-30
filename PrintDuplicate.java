
class PrintDuplicate{
	public static void main(String s[]){
		String s1=new String("paaaavaachhkl");
		char[] ch=s1.toCharArray();
		java.util.Arrays.sort(ch);
		char current=ch[0];
		boolean found=false;
		for(int i=0;i<ch.length;i++){
			if(current==ch[i] && found==false){
				System.out.print(ch[i]+" ");
				found=true;
			}
			if(current!=ch[i]){
				System.out.print(" "+ch[i]);
				current=ch[i];
				found=true;
			}
		}
		
	}
}

				
			
				