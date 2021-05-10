package inheritancediscussion;

public class Test200 extends Test100{
	int i=20;
	static int j=200;
	
	public void m3()
	{
		int i=30;
		int j=300;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		System.out.println("m3 child class non static method");
		System.out.println(j);
		System.out.println(Test200.j);
		System.out.println(Test100.j);
	}
	public static void m4()
	{
		System.out.println("m4 child class static method");
	}
	
	public static void main(String[] args) {
		
		
		Test200 t1=new Test200();
		t1.m3();
//		t1.m1();
//		m2();
//		m4();
//		
//		Test100 t2=new Test100();
//		t2.m1();
		
	}
}
