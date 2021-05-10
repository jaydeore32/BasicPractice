package intrefacediscussion;

public class Test1 implements Interface1,Interface2 {

	int i=20;
	public void m1() 
	{	
	System.out.println("m1 Test");	
	System.out.println(i);
	System.out.println(Interface1.i);
	}
	public void m2()
	{
		System.out.println("m2 Test");		
	}
	public void m4() 
	{
		System.out.println("m4 Test");		
	}
	public void m5() 
	{
		System.out.println("m5 Test");		
	}
	public static void main(String[] args) {
		
		Test1 t1=new Test1();
		t1.m1();
		
		//For calling method from Parent Ref variable and child object
		Interface1 i1=new Test1();
		i1.m1();//Test1 class method will Execute
		
		//for Static mehthod
		
		Interface1.m3();
		
		//for variable
		System.out.println(Interface1.i);
		
		
	}
	

}
