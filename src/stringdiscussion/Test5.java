package stringdiscussion;

public class Test5 {
	
	public static void main(String[] args) {
		
	//13.lastIndexOf(int ch)	
		
		String k="abcdefgh";
		
		int kk=k.lastIndexOf('h');
		System.out.println(kk);
		
	//14.contains
		
		String m="abcdefhidef";
		boolean mm=m.contains("def");
		System.out.println(mm);
	
	//15.toCharArray
		
		String n="abcdefgh";
		
		char [] nn=n.toCharArray();
		
		for(char nnn:nn)
		{
			System.out.println(nnn);
		}
				
		//or
		
		for(int i=0;i<nn.length;i++)
		{
			System.out.println(nn[i]);
		}
		
	//16.isDigit
		
		char p='1';
		
		boolean pp=Character.isDigit(p);
		
		System.out.println(pp);
		
		
		
		
	}

}
