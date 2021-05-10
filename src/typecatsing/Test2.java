package typecatsing;

public class Test2 {
	
	
	public byte m2()
	{
		byte a=10;
		return a;
		
	}
	public static void main(String[] args) {
		
		Test2 t1=new Test2();
		
	int dd=(int) t1.m2();//lower datatype to higher order datatype
	
	System.out.println(dd);
		
		
				
		
	}

}
