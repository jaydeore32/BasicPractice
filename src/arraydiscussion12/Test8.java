package arraydiscussion12;

import java.util.Arrays;

public class Test8 {
	
	//To sort an array in asending order
	public static void main(String[] args) {
		
		int[] intarray =new int[8];
		intarray[0]=100;
		intarray[1]=20;
		intarray[2]=80;
		intarray[3]=40;
		intarray[4]=90;
		intarray[5]=60;
		intarray[6]=50;
		intarray[7]=70;
		
		System.out.println("****before sorting");
		
		for(int aa:intarray)
		{
			System.out.println(aa);
		}
		
		System.out.println("****after sortinh****");
		
		Arrays.sort(intarray);
		
		for(int aa:intarray)
		{
			System.out.println(aa);
		}
		
	}

}
