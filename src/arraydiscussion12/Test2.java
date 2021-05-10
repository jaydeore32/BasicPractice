package arraydiscussion12;

public class Test2 {
	
	public static void main(String[] args) {
		
      int[] intarray =new int[5];
		
		intarray[0]=10;
		intarray[1]=20;
		intarray[2]=30;
		intarray[3]=40;
		intarray[4]=50;
		
		//to calculate total size or length of array
		
		int size=intarray.length;
		
		for(int i=0;i<size;i++)
		{
			System.out.println(intarray[i]);
		}
		
		
	}

}
