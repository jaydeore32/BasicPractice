package inheritancediscussion;

public class Test100 {
	int i=10;
	static int j=100;
	
	public void m1()
	{
		System.out.println("m1 parent class non static method");
	}
	public static void m2()
	{
		System.out.println("m2 parent class static method");
	}
	
	public static void main(String[] args) {
		
		Test100 tt=new Test100();
	tt.m1();
		
	}

}
