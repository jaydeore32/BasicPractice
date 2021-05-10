package stringdiscussion;

public class Test2 {
	
	public static void main(String[] args) {
		
		String a="abc";
		String aa="abcd";
		
		//charAt:
		
		char charmethod = a.charAt(2);
		System.out.println(charmethod);//c
		
		//concat method:
		
		String conjoined = a.concat(aa);
		System.out.println(conjoined);//abcabcd
		
		String conjo = a.concat("xyz");
		System.out.println(conjo);//abcxyz
		System.out.println(a.concat("xyz"));//abcxyz
		
		//equals:
		
		boolean equalsone = a.equals(aa);
		System.out.println(equalsone);//false
		
		//equalsIgnor
		
		String b="xyz";
		String bb="Xyz";
		
		boolean equalignor = b.equalsIgnoreCase(bb);
		System.out.println(equalignor);//True
		
		
	}

}
