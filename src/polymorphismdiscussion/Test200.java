
package polymorphismdiscussion;

public class Test200 extends Test100{
	
	public void m1(char a)
	{
		System.out.println("m1 of Test200");
	}
	
	public void m2()
	{
		System.out.println("m2 of Test200");
	}
	public static void m3()
	{
		System.out.println("m3 of Test200");
	}
	
public static void main(String[] args) {
	
	Test200 t1=new Test200();
	t1.m1();//compile time polymorphism
	t1.m1('b');
	t1.m2();
	
	Test100 t2=new Test100();
	t2.m2();
	
	Test100 t3=new Test200();
	t3.m2();// Run time polymorphism
	t3.m3();//Method hiding
}
}
