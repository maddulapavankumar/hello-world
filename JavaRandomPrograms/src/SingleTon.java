
public class SingleTon {
	static SingleTon sc;

	private SingleTon() {
	}
	static {
		 sc=new SingleTon();
	}
	@Override
	public String toString() {
		return "SingleTon [toString()=" + super.toString() + "]";
	}
	static SingleTon getInstance(){
		return sc;
	}
	public static void main(String args[]){
		SingleTon s=SingleTon.getInstance();
		System.out.print(s);
	}

}
