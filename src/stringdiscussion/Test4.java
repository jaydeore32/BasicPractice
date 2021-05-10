package stringdiscussion;

public class Test4 {
	public static void main(String[] args) {
		
		//9.lowercase
		
		String f="ABCDEFGhij1";
		
		String low=f.toLowerCase();
		System.out.println(low);//abcdefghij1
		
		//10.Uppercase
		
		String g="abcdeFGH";
		String up=g.toUpperCase();
		System.out.println(up);//ABCDEFGH
		
		//11.trim:
		
		String h="   Value   ";
		String hh="Driven";
		
		String trimm = h.trim();
		System.out.println(trimm);//VAlue
		
		System.out.println(trimm+" "+hh);//Value Driven
		
		System.out.println(trimm.concat(" ")+hh);
		
		//indexo (int char)
		
		String i="value";
		
		int ind=i.indexOf('a');
		System.out.println(ind);
		
	}

}
