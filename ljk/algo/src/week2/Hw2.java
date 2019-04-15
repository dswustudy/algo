package week2;

import java.util.Arrays;

public class Hw2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=118372;
		long answer = 0;
		
		String a;
	    String[] digits =String.valueOf(n).split("");
	    for(int i=0;i<digits.length-1;i++) {
	    	for(int j=i+1;j<digits.length;j++) {
	    		if(Integer.parseInt(digits[i])<Integer.parseInt(digits[j])) {
	    			a=digits[j];
	    			digits[j]=digits[i];
	    			digits[i]=a;
	    		}
	    	}
	    	
	    }
	    answer=Long.parseLong(Arrays.toString(digits).replaceAll("[^0-9]",""));
	    System.out.println(answer);
	}
}
