import java.util.Scanner;

public class _2947 {

	public static void main(String[] args) {
		int temp;
		int[] input = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			input[i]=sc.nextInt();
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4-i; j++) {
				if(input[j]>input[j+1]) {
					temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
					for(int k=0; k<5; k++) {
						System.out.print(input[k]);
					}
					System.out.print("\n");
				}
			}
		}
	}
}
