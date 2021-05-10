package arraydiscussion12;

public class Assign {
	
	public static void main(String[] args) {
		
      int[] intarray =new int[5];
		
		intarray[0]=10;
		intarray[1]=20;
		intarray[2]=30;
		intarray[3]=40;
		intarray[4]=50;
		
		for(int i=0;i<5;i++)
		{
			if(i%2==0)////even num
			{
			System.out.println(intarray[i]);
		}
		}
		
		for(int i=0;i<5;i++)
		{
			if(i%2!=0)////odd num
			{
			System.out.println(intarray[i]);
		}
		}
	}

}
