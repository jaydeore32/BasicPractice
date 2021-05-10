package exceptionhandlingdiscussion;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("before arrival of exception");
		int i=10;
		int j=0;
		
		try {
	    int k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch of Arithmatic Exception:"+e.getMessage());
		}
		
		finally
		{
			System.out.println("fineally block is running");
		}
		System.out.println("after handling exception");
		
		
		
		
		
		
	}
	

}
