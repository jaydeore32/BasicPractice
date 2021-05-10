package arraydiscussion12;

public class Test1 {
	
	public static void main(String[] args) {
		
		int[] intarray =new int[5];
		
		intarray[0]=10;
		intarray[1]=20;
		intarray[2]=30;
		intarray[3]=40;
		intarray[4]=50;
		
		for(int i=0;i<5;i++)
		{
			System.out.println(intarray[i]);
		}
		
		//OR
		int[] a= {10,20,30};
		
	   for(int i=0;i<3;i++)
	   {
		   System.out.println(a[i]);
	   }

}
}
