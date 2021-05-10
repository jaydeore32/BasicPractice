package loopsdiscussion;

public class Starpattern {
	public static void main(String[] args) {
		
		//star patter in 5 times in row and 5 times in column
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=5;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		
		//star patter for asending order
		
		
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=5;j++)
		{
			if(j<=i)
			{
			System.out.print("*");
		}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
		
		//desending order
		
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=5;j++)
		{
			if(j<=(6-i))
			{
		  System.out.print("*");
		}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
		
	
	
	
	
		
		
		
	}
	
}
