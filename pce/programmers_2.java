import java.util.Arrays;

public class programmers_2 {
	
	int firstNum,lastNum,kNum;
	
	
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = {commands.length};
	        int[] tmp;
	        int indNum = 0;
	        int index=0;
	        
	        for(int i=0;i<commands.length;i++) {

	        	 firstNum = commands[i][0];
	        	 lastNum = commands[i][1];
	        	 kNum = commands[i][2];
	        	 
	        	 int leng = firstNum-lastNum+1;
	        	 tmp = new int[leng];
	        	 
	        	 for(int j=firstNum-1;j<lastNum;j++) { //자른 임시배열 생성하기 
	        		 tmp[indNum] = array[j];
	        		 indNum++;
	        	 }
	        	 
	        	 Arrays.sort(tmp); //배열 정렬하기 
	        	 	 
	        	 answer[index] = tmp[kNum-1];
	        	 index++;
	        }
	        
	        return answer;
	 
	    }

}
