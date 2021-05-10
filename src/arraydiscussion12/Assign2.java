package arraydiscussion12;

import java.util.Arrays;

public class Assign2 {
	
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
        int c;
		int size=intarray.length;
		
		for(int i=0;i<size;i++)
		{
		for(int j=0;j<size;j++)
		{
			if(intarray[j]>intarray[i])
			{
				c=intarray[i];
				intarray[i]=intarray[j];
				intarray[j]=c;
			}
		}
		
	}
		
		for(int dd:intarray)
		{
			System.out.println(dd);
		}
	}

}
