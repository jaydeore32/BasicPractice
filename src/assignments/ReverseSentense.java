package assignments;

public class ReverseSentense {
	
	public static void main(String[] args) {
		
		String s="The Given String";
		String rev="";
		
		String[] Splitvalue=s.split("\\s");
		
    for(int i=(Splitvalue.length-1);i>=0;i--)
    {
    	
    System.out.print(Splitvalue[i]+" ");	
    	
    }
		
		
	}

}
