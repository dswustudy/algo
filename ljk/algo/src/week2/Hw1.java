package week2;

public class Hw1 {

	public static void main(String[] args) {
		int array[] = {1, 5, 2, 6, 3, 7, 4};
		int commands[][]={{2, 5, 3}, {4, 4, 1}};
		int[] answer = new int[commands.length];
        
        int b;
        for(int n=0;n<commands.length;n++){
        	int[] a = new int[commands[n][1]-commands[n][0]+1];
            for(int i=commands[n][0];i<commands[n][1]+1;i++){
                a[i-commands[n][0]]=array[i-1];
                //a배열에 command만큼 잘라넣기
            }
            for(int x=0;x<a.length;x++) {
            	System.out.println(a[x]);
            }
            System.out.println("================");
            for(int k = 0 ; k <  a.length -1 ; k ++) {
                for(int j = k+1 ; j < a.length ; j ++) {
                    if(a[k] > a[j]) {
                        b = a[j];
                        a[j] = a[k];
                        a[k] = b;
                    }
                }
            }//a배열 선택정렬
            answer[n]=a[commands[n][2]-1];
		}
        for(int x=0;x<answer.length;x++) {
        	System.out.println(answer[x]);
        }
	}

}
