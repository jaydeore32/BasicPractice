package inheritancediscussion;

public class Test300 extends Test200{
	
	public void gm5()
	{
		System.out.println("m5  non static method");
	}
public static void main(String[] args) {
	
	Test300 t3=new Test300();
	t3.gm5();
	t3.m3();
	t3.m1();
	m2();
	m4();
}
}
