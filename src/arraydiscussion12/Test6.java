package arraydiscussion12;

public class Test6 {
	
//	public void m2(int a)
//	{
//		a=150;
//		System.out.println(a);
//	}
	
	//With Argument
	public void m1(int[] a)
	{
		a[0]=100;
		
		for(int b:a)
		{
			System.out.println(b);
		}
		
	}

	
	public static void main(String[] args) {
		
		int[] intarray =new int[5];
		
		intarray[0]=10;
		intarray[1]=20;
		intarray[2]=30;
		intarray[3]=40;
		intarray[4]=50;
		
		Test6 t6=new Test6();
		t6.m1(intarray);
		
	  // int r=10;
		//t6.m2(r);
		
		intarray[0]=10;
		for(int ee:intarray)
		{
			System.out.println(ee);
		}
		
	
	
}
}