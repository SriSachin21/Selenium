package Week1.day4;

import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String args[]) {
		
		int num[]= {2,5,7,7,4,6,2,6,5};
		int num1=num.length;
		 Arrays.sort(num);
		for(int i=0;i<num1-1;i++) {
			if(num[i]==num[i+1])
				System.out.println(num[i]);
		}
	}

}
