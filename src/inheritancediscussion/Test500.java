package inheritancediscussion;

public class Test500 extends Test400{
	
	public Test500 (int k)
	{
		//super(10);
		System.out.println(" zero arg child class constructor ");
	}
	
	public static void main(String[] args) {
		
		Test500 t5=new Test500(10);
		
	}


}
