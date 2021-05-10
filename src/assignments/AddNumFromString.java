package assignments;

public class AddNumFromString {
	
	
	public static void main(String[] args) {
		
		
	String s="ab5cd4ef3gh2ij1";
	String numericstring="";
	int digit =0;
	
	for(int i=0;i<s.length();i++)
		
	{
		if(Character.isDigit(s.charAt(i)))
		{
		numericstring=s.substring(i, i+1);
		digit=digit+Integer.parseInt(numericstring);
		}	
	}	
	System.out.println(digit);	
		
	}

}
