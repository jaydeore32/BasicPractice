package arraydiscussion12;

public class Test7 {
	
	//with return type
	
	public int[] m7()
	{
int[] intarray =new int[5];
		
		intarray[0]=10;
		intarray[1]=20;
		intarray[2]=30;
		intarray[3]=40;
		intarray[4]=50;

	//int[] a= {1,2,3};
	return intarray;
	}
	
public static void main(String[] args) {
		
//		int[] intarray =new int[5];
//		
//		intarray[0]=10;
//		intarray[1]=20;
//		intarray[2]=30;
//		intarray[3]=40;
//		intarray[4]=50;
		
		Test7 t7=new Test7();
		
		for(int ee:t7.m7())
		{
			System.out.println(ee);
		}
		

}
}