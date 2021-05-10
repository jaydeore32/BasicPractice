package assignments;

public class RemoveAlphabates {
	

	public static void main(String[] args) {
		
		String s="abcd1234efg567";
        String numericstring="";
        int digit=0;
		
		  char[] ss=s.toCharArray();
		  
		  for(char sss:ss)
		  {
			  if(Character.isDigit(sss))
			  System.out.print(sss);
		  }
	////// oooooooorrrrrrrrr/////////
		  
		 for(int i=0;i<s.length();i++) 
		 {
			 if(Character.isDigit(s.charAt(i)))
			 {
			numericstring=numericstring+s.charAt(i) ;
		 }
		 }
		 System.out.println(numericstring);
		  
		  
}
}