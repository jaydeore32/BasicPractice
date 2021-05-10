package arraydiscussion12;

public class Test5 {
	
	public static void main(String[] args) {
		
		int[] intarray =new int[5];
		
		intarray[0]=10;
		intarray[1]=20;
		intarray[2]=30;
		intarray[3]=40;
		intarray[4]=50;
		
		for(int cc:intarray)
		{
			if(cc==10) 
			{
				intarray [2]=80;
			}
				
			System.out.println(cc);
		}
		for(int dd:intarray)
		{
			dd=100;
	
		System.out.println(dd);
		}

}
}