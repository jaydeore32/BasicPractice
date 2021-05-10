package arraydiscussion12;

public class Test3 {
	
	public static void main(String[] args) {
		
	      int[] intarray =new int[5];
			try {
			intarray[0]=10;
			intarray[1]=20;
			intarray[2]=30;
			intarray[3]=40;
			intarray[4]=50;
			intarray[5]=60;//exception
			intarray[6]=70;
			intarray[7]=80;
			}
			//to calculate total size or length of array and array index bound Exception
			catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println("catch of arrayindexboundexception");
			}
			int size=intarray.length;
			
			for(int i=0;i<size;i++)
			{
				System.out.println(intarray[i]);
			}
			
			
		}


}
