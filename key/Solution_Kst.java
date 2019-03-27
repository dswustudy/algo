
public class Solution_Kst {

	public static int[] solution(int[] array, int[][] commands) {
		//public static int solution(int[] array, int[][] commands) {
		//int[] answer = new int[commands.length];
		int[] answer = new int[commands.length];
		int end, start, temp;

		for(int k=0; k<commands.length; k++) {

			end = commands[k][1];	//마지막 값 지정
			start = commands[k][0]-1;	//처음 시작 값 지정
			int[] input_array = new int[end-start];	//초기 배열을 저장하기 위한 것
			
			for(int i = 0; i<end-start; i++){	//command의 갯수만큼 사용하기 위해 다른 배열에 초기 배열 저장
				input_array[i] = array[start+i];
			}

			for(int i=input_array.length; i>0; i--) {	//버블정렬
				for(int j=0;j<i-1;j++) {
					if(input_array[j]>input_array[j+1]) {
						temp=input_array[j];
						input_array[j]=input_array[j+1];
						input_array[j+1]=temp;
					}
				}
			}
			answer[k]=input_array[commands[k][2]-1];
		}
        return answer;
    }


	public static void main(String[] args) {

		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		for(int k=0; k<commands.length; k++) {
			System.out.println(solution(array, commands)[k]);
		}
	}

}
