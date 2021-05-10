package stringdiscussion;

public class Test3 {
	public static void main(String[] args) {
		
		String c="abcDDEf";
		String cc="";
		
		//5.substring(begin value)
		
		String substr = c.substring(2);
		System.out.println(substr);//cDDEf
		
		//6.substring (beg index, end index):
		
		String substrr=c.substring(2, 6);
		System.out.println(substrr);//cDDE
		
		//7.length:
		
		String d="abcDDEf";
		
		int leng = d.length();
		System.out.println(leng);//7
		
		//replace:
		
		String str="ababa12";
		
		String rep=str.replace('1', 'b');
		System.out.println(rep);
		
	}

}
