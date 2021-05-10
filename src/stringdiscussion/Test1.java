package stringdiscussion;

public class Test1 {
	
	public static void main(String[] args) {
		
		String s="abc";
		
		String ss=new String("abcd");
		
	//1.charAt method:
	
		char charatsecondindex = s.charAt(2);
		
		System.out.println(charatsecondindex);// Output= c
		
	//2.concat method:
		
		String joinedone=s.concat("xyz");
		
		System.out.println(joinedone);//Output: abcxyz
		System.out.println(s.concat("xyz"));//Output: abcxyz
		
		
		String j=s.concat(ss);
		System.out.println(j);//Output= abcabcd
		
	//3.equals method:
		
		boolean ismatch = s.equals("abc");
		
		System.out.println(ismatch);//Output: true
		
		
	if(ss==s)
	{
		System.out.println("same objcet");
	}
	else
	{
		System.out.println("different object");
	}
	

		
		
		
	}

}
