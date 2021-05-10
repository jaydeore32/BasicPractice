package arraydiscussion12;

public class Swap {
	
	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		int c;
		
		//swap by using third varible
        
		if(a>b)
		{
			c=a;
			a=b;
			b=c;
			System.out.println(a);
			System.out.println(b);
		}
		
		//swap without third variable
		
		if(a>b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a);
			System.out.println(b);
		}
		
	}

}
