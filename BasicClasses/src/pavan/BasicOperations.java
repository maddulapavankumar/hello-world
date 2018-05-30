package pavan;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
			Reverse reverse= new Reverse(4508);
			Fibonacci fib=new Fibonacci(10);
			Armstrong arm=new Armstrong(1111);
			LargestOfThree l=new LargestOfThree(12,45,27);
			reverse.calculate();
			
			arm.calculate();
			l.calculate();
			fib.calculate();
	}

}
