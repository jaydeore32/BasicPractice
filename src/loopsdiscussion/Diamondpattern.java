package loopsdiscussion;

public class Diamondpattern {
	
public static void main(String[] args) {
	for(int i=1;i<=3;i++)
	{
	for(int j=1;j<=5;j++)
	{
	
		if(j>=(4-i)&& j<=(2+i))
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
	for(int i=1;i<=3;i++)
	{
	for(int j=1;j<=5;j++)
	{
		if(j>=(1+i)&& j<=(5-i))
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
