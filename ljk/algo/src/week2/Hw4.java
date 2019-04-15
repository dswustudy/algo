package week2;

import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
		int a[]=new int[5];
		int b;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=scan.nextInt();
		}
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length -i -1 ; j ++) {
				if(a[j]>a[j+1]) {
					b = a[j];
					a[j] = a[j+1];
					a[j+1] = b;
					for(int k = 0 ; k < a.length ; k ++) {
						System.out.print(a[k]+" ");
					}
					System.out.println();
				}
			}
		}
		
	}
}
