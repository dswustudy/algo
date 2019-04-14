import java.util.Scanner;

public class baekjoonAlgo_1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) 
			arr[i] = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
					for(int k=0;k<arr.length;k++) 
						System.out.print(arr[k]+" ");
					
					System.out.println();
				}
					
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
