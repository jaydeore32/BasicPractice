package stringdiscussion;

public class Test6 {
	
	public static void main(String[] args) {
		
		//convert primetive into string
		
		int s=123;
		
		String ss=String.valueOf(s);
		System.out.println(ss+1);
		
		char j='a';
		String jj=String.valueOf(j);
		System.out.println(jj+1);
		
		
		//convert string into primitive
		
		String t="true";
		Boolean tt=Boolean.parseBoolean(t);
		System.out.println(tt);
		
		String ttt="1234";
		int tttt=Integer.parseInt(ttt);
		System.out.println(tttt);
		
	}

}
