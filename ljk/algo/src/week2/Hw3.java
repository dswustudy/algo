package week2;

import java.util.ArrayList;
import java.util.Arrays;

public class Hw3 {
	static int max=0;
	public static void main(String[] args) {
		Hw3 ex = new Hw3();
        int[] arr = { 6, 10, 2 };
        ex.doPermutation(arr, 0);
        printResult();
	}
	public static void printResult() {
		System.out.println(max);
	}
	public void doPermutation(int[] arr, int startIdx){
        int length = arr.length;
        int number[];
        int num;
        ArrayList<Integer> list=new ArrayList<>();
        if(startIdx == length-1){
            for(int n: arr) {
            	list.add(n);
            }
            number= new int[list.size()];
            for(int c=0;c<list.size();c++) {
            	number[c]=list.get(c);
            }
            num=Integer.parseInt(Arrays.toString(number).replaceAll("[^0-9]",""));
    	    if(max<num) {
    	    	max=num;
    	    }
            return;
        }

        for(int i=startIdx; i<length; i++){
            swap(arr, startIdx, i);
            doPermutation(arr, startIdx+1);
            swap(arr, startIdx, i);
        }
    }

    public void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
	
	
}
