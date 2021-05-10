package loopsdiscussion;

public class While {
	
	public static void main(String[] args) {

		int x=15;
		
		
	while(x<20)
	{
		System.out.println(x);
		x++;
		
	}
	//Reversed Number
	
	int num=123456;
	int rev=0;
	int rem;
	
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
	

}
}