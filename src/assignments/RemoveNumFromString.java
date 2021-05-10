package assignments;

public class RemoveNumFromString {
	
public static void main(String[] args) {
	
String s="ab12cd34";
String numericstring="";
int digit=0;

//  char[] ss=s.toCharArray();
//  
//  for(char sss:ss)
//  {
//	  if(!Character.isDigit(sss))
//	  {
//	  System.out.print(sss);
//  }
//  }
	////// oooooooorrrrrrrrr/////////
  

for(int i=0;i<s.length();i++)
{
	if(!Character.isDigit(s.charAt(i)))
	{
numericstring=numericstring+s.charAt(i)	;
}
} 
 System.out.println(numericstring); 
  
  
  
  
  
  
}	

}
