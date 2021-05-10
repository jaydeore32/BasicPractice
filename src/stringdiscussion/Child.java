package stringdiscussion;

public class Child {
	public static void main(String[] args) {
		
		String[] ss=new String[5];
		
		ss[0]="one";
		ss[1]="two";
		ss[2]="three";
		ss[3]="four";
		ss[4]="five";
		
		Parent pp=new Parent();
		pp.main(ss);
	}

}
