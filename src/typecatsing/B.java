package typecatsing;

public class B extends A {
	
	public void m2(int a)
	{
		System.out.println("m2 B method");
	}

	
	public void m1()
	{
		System.out.println("m1 B method");
	}
	
	public static void main(String[] args) {
		
		//Implicit Typecasting
		B b=new B();
		b.m1();//m1 method of B
		
		A aa=(A) b;
		aa.m1();// m1 method of B
		aa.m2();//m2 method of A
	//	aa.m2();
		//Explicit Typecasting
		
		A a=new A();
		a.m1();//m1 method of A
	
	//B bb=(B) a;
	//bb.m2(0);
	//	bb.m1();//not excecute
		
	}

}
